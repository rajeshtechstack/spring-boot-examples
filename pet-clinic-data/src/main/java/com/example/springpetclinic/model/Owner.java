package com.example.springpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person {

    private Set<Pet> pets = new HashSet<>();
    private String address;

    private String city;

    private String telephone;
}
