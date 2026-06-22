package com.insurance.userservice.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/getuser")
    public Map<String, String> getUser() {
        return Map.of("message", "User Service is working!");
    }
}