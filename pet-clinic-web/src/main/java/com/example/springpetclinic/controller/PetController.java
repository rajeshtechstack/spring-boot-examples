package com.example.springpetclinic.controller;

import com.example.springpetclinic.service.PetService;
import com.example.springpetclinic.service.PetServiceEX;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class PetController {

    private final static Logger logger = LoggerFactory.getLogger(PetController.class);

    private final PetServiceEX petServiceEX;

    public PetController(PetServiceEX petServiceEX) {
        this.petServiceEX = petServiceEX;
    }

    public String whichPetIsTheBest(){
        logger.info("PetController:: whichPetIsTheBest: {}",petServiceEX.getPetType());
        return petServiceEX.getPetType();
    }
}
