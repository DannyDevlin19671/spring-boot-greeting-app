package com.binevenagh.spring.boot;

import org.springframework.stereotype.Service;

/**
 * @project greeting-app
 * @description This class provides a greeting service in English.
 * It implements the GreetingService interface.
 */
@Service("englishGreetingService")
public class EnglishGreetingService implements GreetingService {

    /**
     * @Date: 2023-10-01
     * @Author: Daniel Devlin
     * Generates a greeting message in English.
     *
     * @param name the name of the person to greet
     * @return a greeting message in the format "Hello, {name}!"
     */
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
