package com.insurance.policyservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @GetMapping("/getpolicy")
    public String getPolicy() {
        return "Policy Service is working!";
    }
}
