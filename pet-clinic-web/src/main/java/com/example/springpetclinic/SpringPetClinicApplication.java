package com.example.springpetclinic;

import com.example.springpetclinic.controller.I18NController;
import com.example.springpetclinic.controller.PetController;
import com.example.springpetclinic.datasource.SampleDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=  SpringApplication.run(SpringPetClinicApplication.class, args);
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayHello());

        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println(petController.whichPetIsTheBest());

        SampleDatasource sampleDatasource = (SampleDatasource)ctx.getBean("sampleDatasource");
        System.out.println(sampleDatasource);

        SampleDatasource sampleConstructorDatasource = (SampleDatasource)ctx.getBean("sampleConstructorDatasource");
        System.out.println("Constructor Props : "+sampleConstructorDatasource);
    }

}
