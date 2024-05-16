package com.IzaiasValentim.donationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IzaiasValentim.donationapi.entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Long>{
}
