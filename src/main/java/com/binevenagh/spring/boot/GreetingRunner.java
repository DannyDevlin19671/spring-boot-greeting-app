package com.binevenagh.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @project greeting-app
 * @description This class is responsible for running the greeting services in multiple languages.
 * It uses three different `GreetingService` implementations for English, Spanish, and French.
 */
@Component
public class GreetingRunner {

    private static final Logger logger = LoggerFactory.getLogger(GreetingRunner.class);

    private final GreetingService englishService;
    private final GreetingService spanishService;
    private final GreetingService frenchService;

    /**
     * Constructor for `GreetingRunner`.
     *
     * @param englishService the English greeting service, identified by the qualifier "englishGreetingService"
     * @param spanishService the Spanish greeting service, identified by the qualifier "spanishGreetingService"
     * @param frenchService the French greeting service, identified by the qualifier "frenchGreetingService"
     */
    public GreetingRunner(
            @Qualifier("englishGreetingService") GreetingService englishService,
            @Qualifier("spanishGreetingService") GreetingService spanishService,
            @Qualifier("frenchGreetingService") GreetingService frenchService
    ) {
        this.englishService = englishService;
        this.spanishService = spanishService;
        this.frenchService = frenchService;
    }

    /**
     * Executes the greeting services for a predefined name and logs the results.
     * The name used is "Alice".
     */
    public void run() {
        String name = "Alice";
        logger.info(englishService.greet(name));
        logger.info(spanishService.greet(name));
        logger.info(frenchService.greet(name));
    }
}
