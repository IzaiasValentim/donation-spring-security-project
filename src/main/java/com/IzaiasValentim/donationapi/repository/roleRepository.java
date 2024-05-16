package com.IzaiasValentim.donationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IzaiasValentim.donationapi.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
