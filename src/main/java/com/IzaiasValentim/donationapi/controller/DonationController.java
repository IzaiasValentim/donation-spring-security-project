package com.IzaiasValentim.donationapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.IzaiasValentim.donationapi.entity.Donation;
import com.IzaiasValentim.donationapi.entity.dto.DonationViewDTO;
import com.IzaiasValentim.donationapi.service.DonationService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("donations")
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping
    public ResponseEntity<List<DonationViewDTO>> getAllDonationsPublicView() {
        return ResponseEntity.ok().body(donationService.getAllDonationPublicView());
    }
    

}