package com.example.springpetclinic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1")
public class IndexController {

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping({"","/","index", "index.html"})
    public String getIndexPage(Model model){
        logger.info("IndexController:: getIndexPage:");
        model.addAttribute("welcome","Welcome to Index page");
        return "index";
    }
    @RequestMapping({"/notimplemented", "/notimplemented.html"})
    public String getNotImplementedPage(Model model){
        logger.info("IndexController:: getNotImplementedPage: ");
        model.addAttribute("notimplemented","Not Implemented yet");
        return "notimplemented";
    }

    @RequestMapping({"/oups"})
    public String getOopsPage(Model model){
        logger.info("IndexController:: getOopsPage: ");
        model.addAttribute("notimplemented","Not Implemented yet");
        return "notimplemented";
    }

}
