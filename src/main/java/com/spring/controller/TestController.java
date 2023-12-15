package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    //http://localhost:8080/api/name
    @GetMapping("/name")
    public String getName()
    {
        return "I am Azza";
    }
}
