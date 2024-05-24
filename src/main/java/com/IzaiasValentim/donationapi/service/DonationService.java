package com.IzaiasValentim.donationapi.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.IzaiasValentim.donationapi.entity.Donation;
import com.IzaiasValentim.donationapi.entity.dto.DonationCreationDTO;
import com.IzaiasValentim.donationapi.entity.dto.DonationViewDTO;
import com.IzaiasValentim.donationapi.repository.DonationRepository;

import jakarta.transaction.Transactional;

@Service
public class DonationService {

    private final DonationRepository donationRepository;

    @Autowired
    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public List<DonationViewDTO> getAllDonationPublicView() {
        List<DonationViewDTO> donationsViewDTO = new ArrayList<>();

        donationRepository.findAll().forEach(donation -> {
            donationsViewDTO.add(new DonationViewDTO(donation));
        });

        return donationsViewDTO;
    }

    @Transactional
    public ResponseEntity<DonationViewDTO> saveDonation(DonationCreationDTO donation) {
        Donation donationToSave = donation.dtoToDonation();
        donationToSave.setValidationTime(null);
        donationToSave.setVerificationUserUsername("Not yet validated.");
        donationRepository.save(donationToSave);

        DonationViewDTO donationReturned = new DonationViewDTO(donationToSave);

        URI readerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("id={id}")
                .buildAndExpand(donationToSave.getId())
                .toUri();
        return ResponseEntity.created(readerLocation).body(donationReturned);
    }

    public Double getTotalDoanted(Boolean aprovated) {

        var allDonations = getAllDonations();
        Double totalDoanted = 0.0;

        if (aprovated == true) {
            for (var donation : allDonations) {
                if (donation.getVerified() == true)
                    totalDoanted += donation.getAmountDonated();
            }
            return totalDoanted;
        } else {
            for (var donation : allDonations) {
                totalDoanted += donation.getAmountDonated();
            }
        }

        return totalDoanted;
    }
}
