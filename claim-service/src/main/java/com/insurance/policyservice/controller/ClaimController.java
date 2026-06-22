package com.insurance.policyservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    @GetMapping("/getclaim")
    public String getClaim() {
        return "Claim Service is working!";
    }
}
