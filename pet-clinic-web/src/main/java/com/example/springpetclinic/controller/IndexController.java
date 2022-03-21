package com.example.springpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1")
public class IndexController {

    @RequestMapping({"","/","index", "index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("welcome","Welcome to Index page");
        return "index";
    }
    @RequestMapping({"/notimplemented", "/notimplemented.html"})
    public String getNotImplementedPage(Model model){
        model.addAttribute("notimplemented","Not Implemented yet");
        return "notimplemented";
    }

    @RequestMapping({"/oups"})
    public String getOopsPage(Model model){
        model.addAttribute("notimplemented","Not Implemented yet");
        return "notimplemented";
    }

}
