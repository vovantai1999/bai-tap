package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")

public class HomeController {

    @GetMapping
    public String showHomePage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("login");

         return "login";
    }
}
