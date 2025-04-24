package com.rishi.cicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("Hello World");
        return "hello"; // This will map to hello.html in /templates
    }
}
