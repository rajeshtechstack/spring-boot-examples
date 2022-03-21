package com.example.springpetclinic.service.impl;

import com.example.springpetclinic.service.PetService;
import com.example.springpetclinic.service.PetServiceEX;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service
public class CatPetService implements PetServiceEX {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
