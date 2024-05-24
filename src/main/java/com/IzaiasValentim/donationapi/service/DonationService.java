package com.IzaiasValentim.donationapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IzaiasValentim.donationapi.entity.Donation;
import com.IzaiasValentim.donationapi.entity.dto.DonationViewDTO;
import com.IzaiasValentim.donationapi.repository.DonationRepository;

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
}
