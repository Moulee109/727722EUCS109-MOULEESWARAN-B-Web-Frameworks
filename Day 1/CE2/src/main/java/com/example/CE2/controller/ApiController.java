package com.example.CE2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiController {
    @GetMapping("/name")
    public String getMethodName(@RequestParam String name) {
        return "My name is "+ name + "!";
    }
    
}
