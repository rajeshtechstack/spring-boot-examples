package com.example.springpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{

    private LocalDate date;


    private String description;

    private Pet pet;
}
