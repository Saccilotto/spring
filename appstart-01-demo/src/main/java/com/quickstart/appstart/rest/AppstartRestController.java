package com.quickstart.appstart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppstartRestController {
    //expose "/" that returns "Hello World!
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
    
}