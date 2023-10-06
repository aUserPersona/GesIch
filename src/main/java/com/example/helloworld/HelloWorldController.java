package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World For Spring Boot";
    }

    @RequestMapping("/goodBye")
    public String goodBye() {
        return "Bye from Spring Boot";
    }
}

