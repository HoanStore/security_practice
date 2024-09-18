package com.mqnic.hoan_security_ch01_ex00.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/hello")
    public String simpleResourceThatIWant() {
        return "Hello Spring Security";
    }
}
