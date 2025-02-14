package com.IzaiasValentim.donationapi.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.IzaiasValentim.donationapi.repository.UserRepository;

@Service
public class UserUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByUsername(username).map(UserUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with this username: " + username));
    }

}
