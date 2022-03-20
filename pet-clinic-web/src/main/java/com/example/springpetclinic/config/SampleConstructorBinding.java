package com.example.springpetclinic.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ToString
@AllArgsConstructor
@ConfigurationProperties("com.example")
@ConstructorBinding
public class SampleConstructorBinding {
    private String username;
    private String password;
    private String jdbcUrl;
}
