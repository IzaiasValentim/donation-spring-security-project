package com.IzaiasValentim.donationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IzaiasValentim.donationapi.entity.Donation;
import com.IzaiasValentim.donationapi.repository.DonationRepository;

@Service
public class DonationService {
    
    private final DonationRepository donationRepository;

    @Autowired
    public DonationService(DonationRepository donationRepository){
        this.donationRepository = donationRepository;
    }
    public List<Donation> getAllDonations(){
        return donationRepository.findAll();
    }
}
