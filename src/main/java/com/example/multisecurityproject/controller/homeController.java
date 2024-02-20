package com.example.multisecurityproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

    @GetMapping("/")
    public ModelAndView home()
    {
        // Add any model attributes if needed
        return new ModelAndView("hello Home");
    }


    @GetMapping("/private")
    public ModelAndView secure()
    {
        // Add any model attributes if needed
        return new ModelAndView("hello Home");
    }

}
