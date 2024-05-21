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
@Table(name = "DONATIONS")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_donation")
    private Long id;
    @Column(name = "donor")
    private String donor_Name;
    @Column(name = "number")
    private String phone;
    private String email;
    private Double value;
    private String transferVoucher;
    private Boolean anonymous;
    private Boolean verified;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created;
    private LocalDateTime validationTime;
    private User userOfValidation;

    public Donation() {
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

    public User getUserOfValidation() {
        return userOfValidation;
    }

    public void setUserOfValidation(User userOfValidation) {
        this.userOfValidation = userOfValidation;
    }

}
