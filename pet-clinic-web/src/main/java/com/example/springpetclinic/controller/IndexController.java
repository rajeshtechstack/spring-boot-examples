package com.example.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index", "index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("welcome","Welcome to Index page");
        return "index";
    }
}
