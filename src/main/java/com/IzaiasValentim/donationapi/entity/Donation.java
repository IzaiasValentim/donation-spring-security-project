package com.IzaiasValentim.donationapi.entity;

import java.time.LocalDateTime;

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
    private LocalDateTime created;
    private LocalDateTime validationTime;
    private User userOfValidation;

}
