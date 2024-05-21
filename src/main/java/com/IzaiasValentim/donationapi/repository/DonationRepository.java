package com.IzaiasValentim.donationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IzaiasValentim.donationapi.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long>{
    
}
