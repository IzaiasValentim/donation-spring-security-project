package com.IzaiasValentim.donationapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value="managers")
public class UserController {

    @GetMapping("/say-hello")
    public String securedHelloWorld() {
        return "Hello, secure world!";
    }
    
}
