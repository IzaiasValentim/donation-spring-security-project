package com.IzaiasValentim.donationapi.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

    private Long id;
    private String username;
    private String password;
    private Set<Role> roles = new HashSet<>();

}
