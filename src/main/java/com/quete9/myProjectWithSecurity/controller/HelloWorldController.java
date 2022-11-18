package com.quete9.myProjectWithSecurity.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String[] secret(Model model) {
        String[] city = {"Lille", "Paris", "Lyon", "Marseille", "Nantes", "Strasbourg", "Toulouse"};
        return city;
    }
}
