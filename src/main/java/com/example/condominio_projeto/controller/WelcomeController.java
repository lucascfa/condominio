package com.example.condominio_projeto.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem-vindo! Lucas";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRoel('USER')")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasAnyRoel('MANAGER')")
    public String managers(){
        return "Authorized manager";
    }
}
