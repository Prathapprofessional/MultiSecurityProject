package com.example.multisecurityproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class homeController {

    @GetMapping("/")
    public String home()
    {
        return "hello Home";
    }


    @GetMapping("/private")
    public String secure()
    {
        return "hello Secured";
    }

}
