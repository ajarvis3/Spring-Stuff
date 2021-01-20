package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "My first controller";
    }

    @RequestMapping("/Greeting")
    public String greeting() {
        return "Greetings";
    }
}