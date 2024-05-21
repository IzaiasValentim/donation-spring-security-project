package com.IzaiasValentim.donationapi.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DONATIONS__")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private Long id;
    @Column(name = "donor")
    private String donor_Name;
    @Column(name = "number")
    private String phone;
    private String email;
    @Column(name = "amount")
    private Double amountDonated;
    private String transferVoucher;
    private Boolean anonymous;
    private Boolean verified;
    @CreationTimestamp
    @Column(name = "creation_date", updatable = false)
    private LocalDateTime created;
    @Column(name = "validation_date")
    private LocalDateTime validationTime;
    @Column(name = "username_employee")
    private String verificationUserUsername;

    public Donation() {
    }

    public Donation(Long id, String donor_Name, String phone, String email, Double amountDonated, String transferVoucher,
            Boolean anonymous, Boolean verified, LocalDateTime created, LocalDateTime validationTime,
            String verificationUserUsername) {
        this.id = id;
        this.donor_Name = donor_Name;
        this.phone = phone;
        this.email = email;
        this.amountDonated = amountDonated;
        this.transferVoucher = transferVoucher;
        this.anonymous = anonymous;
        this.verified = verified;
        this.created = created;
        this.validationTime = validationTime;
        this.verificationUserUsername = verificationUserUsername;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonor_Name() {
        return donor_Name;
    }

    public void setDonor_Name(String donor_Name) {
        this.donor_Name = donor_Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(Double amountDonated) {
        this.amountDonated = amountDonated;
    }

    public String getTransferVoucher() {
        return transferVoucher;
    }

    public void setTransferVoucher(String transferVoucher) {
        this.transferVoucher = transferVoucher;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getValidationTime() {
        return validationTime;
    }

    public void setValidationTime(LocalDateTime validationTime) {
        this.validationTime = validationTime;
    }

    public String getVerificationUserUsername() {
        return verificationUserUsername;
    }

    public void setVerificationUserUsername(String verificationUserUsername) {
        this.verificationUserUsername = verificationUserUsername;
    }

}
