package com.example.springpetclinic.service.impl;

import com.example.springpetclinic.service.PetService;
import com.example.springpetclinic.service.PetServiceEX;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetService implements PetServiceEX {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
