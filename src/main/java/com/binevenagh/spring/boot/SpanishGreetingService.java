package com.binevenagh.spring.boot;

import org.springframework.stereotype.Service;

/**
 * @project greeting-app
 * @description This class provides a greeting service in Spanish.
 * It implements the GreetingService interface.
 */

@Service("spanishGreetingService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hola " + name + "!";
    }
}
