package com.example.springpetclinic.controller;

import com.example.springpetclinic.service.PetService;
import com.example.springpetclinic.service.PetServiceEX;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class PetController {
    private final PetServiceEX petServiceEX;

    public PetController(PetServiceEX petServiceEX) {
        this.petServiceEX = petServiceEX;
    }

    public String whichPetIsTheBest(){
        return petServiceEX.getPetType();
    }
}
