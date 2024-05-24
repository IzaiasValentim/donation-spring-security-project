package com.IzaiasValentim.donationapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.IzaiasValentim.donationapi.entity.Donation;
import com.IzaiasValentim.donationapi.entity.dto.DonationCreationDTO;
import com.IzaiasValentim.donationapi.entity.dto.DonationViewDTO;
import com.IzaiasValentim.donationapi.service.DonationService;

@RestController
@RequestMapping("donations")
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/viewAll")
    @PreAuthorize("hasAuthority('SCOPE_TOTAL') || hasAuthority('SCOPE_PARTIAL')")
    public ResponseEntity<List<Donation>> getAllDonationsManagerView() {
        return ResponseEntity.ok().body(donationService.getAllDonations());
    }

    @PatchMapping("verifyDonation")
    @PreAuthorize("hasAuthority('SCOPE_TOTAL') || hasAuthority('SCOPE_PARTIAL')")
    public ResponseEntity<Donation> verifyDonation(@RequestParam(required = true) Long id,
            Authentication authentication) {
        return donationService.donationVerification(id, authentication.getName());
    }

    @GetMapping
    public ResponseEntity<List<DonationViewDTO>> getAllDonationsPublicView() {
        return ResponseEntity.ok().body(donationService.getAllDonationPublicView());
    }

    @GetMapping("/totalOfDonations")
    public ResponseEntity<Double> getMethodName(@RequestParam(required = false) Boolean aproved) {
        if (aproved == null)
            aproved = false;
        return ResponseEntity.ok().body(donationService.getTotalDoanted(aproved));
    }

    @PostMapping("/donate/")
    public ResponseEntity<DonationViewDTO> postMethodName(@RequestBody DonationCreationDTO donationToSave) {
        if (donationToSave.isNotBlank()) {
            return donationService.saveDonation(donationToSave);
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

}