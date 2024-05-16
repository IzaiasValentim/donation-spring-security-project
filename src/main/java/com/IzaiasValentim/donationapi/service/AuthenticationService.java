package com.IzaiasValentim.donationapi.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.IzaiasValentim.donationapi.config.Jwt.JwtService;

@Service
public class AuthenticationService {
    private final JwtService jwtService;

    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }
}
