package com.binevenagh.spring.boot;

import org.springframework.stereotype.Service;

/**
 * @project greeting-app
 * @description This class provides a greeting service in French.
 * It implements the GreetingService interface.
 */
@Service("frenchGreetingService")
public class FrenchGreetingService implements GreetingService
{
    /**
     * Generates a greeting message in French.
     *
     * @param name the name of the person to greet
     * @return a greeting message in French
     */
    @Override
    public String greet(String name) {
        return "Bonjour, " + name + "!";
    }
}
