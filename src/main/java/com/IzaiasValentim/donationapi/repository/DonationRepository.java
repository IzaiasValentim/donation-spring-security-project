package com.IzaiasValentim.donationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IzaiasValentim.donationapi.entity.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long>{
    
}
