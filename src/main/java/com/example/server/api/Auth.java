package com.example.server.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Auth {

    @PostMapping(value = "/login")
    public void login() {

    }

    @PostMapping(value = "/logout")
    public void logout() {

    }
}
