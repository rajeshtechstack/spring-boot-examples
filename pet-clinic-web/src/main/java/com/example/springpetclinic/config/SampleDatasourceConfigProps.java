package com.example.springpetclinic.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ToString
@ConfigurationProperties("com.example")
@Configuration
public class SampleDatasourceConfigProps {
    private String username;
    private String password;
    private String jdbcUrl;
}
