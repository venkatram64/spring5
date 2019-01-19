package com.venkat.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class ThymeleafController {

    @GetMapping("/view")
    public String whatIsCool(){
        return "thymeleaf-is-cool";
    }

    @GetMapping("/model")
    public String whatCanWePassToView(Model model){

        model.addAttribute("attributeKey", "I love good people not bad people.");
        return "thymeleaf-is-cool";
    }
}
