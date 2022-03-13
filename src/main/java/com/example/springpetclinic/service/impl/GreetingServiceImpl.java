package com.example.springpetclinic.service.impl;

import com.example.springpetclinic.service.GreetingService;
import org.springframework.stereotype.Service;

@Service("greetingServiceImpl")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi. Hello";
    }
}
