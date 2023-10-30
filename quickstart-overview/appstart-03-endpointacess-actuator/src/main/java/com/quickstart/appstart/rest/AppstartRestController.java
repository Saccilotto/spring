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

    //expose a new endpoint
	@GetMapping("/endpoint")
	public String getDailyWorkout() {
		return "This is a new endpoint.";
	}

    //expose yet a new endpoint
    @GetMapping("/another")
    public String getAnother() {
        return "Another one (pointing guy meme).";
    }
}