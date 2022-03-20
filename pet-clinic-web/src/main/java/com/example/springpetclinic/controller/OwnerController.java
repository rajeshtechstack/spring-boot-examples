package com.example.springpetclinic.controller;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/index","/index.html"})
    public String getOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
