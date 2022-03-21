package com.example.springpetclinic.config;

import com.example.springpetclinic.datasource.SampleDatasource;
import com.example.springpetclinic.service.PetService;
import com.example.springpetclinic.service.map.PetServiceMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application-uat.properties")
@EnableConfigurationProperties(SampleConstructorBinding.class)
@Configuration
public class SampleConfig {

    @Bean
    SampleDatasource sampleDatasource(SampleDatasourceConfigProps sampleDatasourceConfigProps){
        System.out.println("config props: "+ sampleDatasourceConfigProps);
        SampleDatasource sampleDatasource = new SampleDatasource();
        sampleDatasource.setUsername(sampleDatasourceConfigProps.getUsername());
        sampleDatasource.setPassword(sampleDatasourceConfigProps.getPassword());
        sampleDatasource.setJdbcUrl(sampleDatasourceConfigProps.getJdbcUrl());
        return sampleDatasource;
    }

    @Bean("sampleConstructorDatasource")
    SampleDatasource sampleConstructorDatasource(SampleConstructorBinding sampleConstructorBinding){
        System.out.println("constructor props test: "+ sampleConstructorBinding);
        SampleDatasource sampleDatasource = new SampleDatasource();
        sampleDatasource.setUsername(sampleConstructorBinding.getUsername());
        sampleDatasource.setPassword(sampleConstructorBinding.getPassword());
        sampleDatasource.setJdbcUrl(sampleConstructorBinding.getJdbcUrl());
        return sampleDatasource;
    }
    @Bean("petService")
    PetService getPetService(){
        PetService petServic = new PetServiceMap();
        return petServic;
    }
}
