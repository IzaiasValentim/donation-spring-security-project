package com.IzaiasValentim.donationapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value="managers")
public class UserController {

    @GetMapping("/say-hello-total")
    @PreAuthorize("hasAuthority('SCOPE_TOTAL') && hasAuthority('SCOPE_PARTIAL')")
    public String securedHelloWorld() {
        return "Hello, secure world!";
    }
    @GetMapping("/say-hello-partial")
    @PreAuthorize("hasAuthority('SCOPE_TOTAL') || hasAuthority('SCOPE_PARTIAL')")
    public String securedHelloWorldPartial() {
        return "Hello, secure world!";
    }
}
