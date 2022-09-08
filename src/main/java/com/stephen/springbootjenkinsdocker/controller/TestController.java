package com.stephen.springbootjenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String welcome(){
        return "welcome to Jenkins and Docker";
    }
}
