package com.IzaiasValentim.donationapi.entity.dto;

import java.time.LocalDateTime;

import com.IzaiasValentim.donationapi.entity.Donation;

public class DonationViewDTO {
    private Double amountDonated;
    private Boolean anonymous;
    private LocalDateTime created;

    public DonationViewDTO() {
    }

    public DonationViewDTO(Donation donation) {
        this.amountDonated = donation.getAmountDonated();
        this.anonymous = donation.getAnonymous();
        this.created = donation.getCreated();
    }

    public Double getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(Double amountDonated) {
        this.amountDonated = amountDonated;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    
}
