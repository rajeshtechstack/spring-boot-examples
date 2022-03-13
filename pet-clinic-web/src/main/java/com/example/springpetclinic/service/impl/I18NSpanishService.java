package com.example.springpetclinic.service.impl;

import com.example.springpetclinic.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18NService")
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola. Chica";
    }
}
