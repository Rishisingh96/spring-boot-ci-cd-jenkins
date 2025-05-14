package com.rishi.cicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String getHello() {
        System.out.println("Home page is loaded..........");
        return "home"; // This will map to home.html in /templates
    }
}
