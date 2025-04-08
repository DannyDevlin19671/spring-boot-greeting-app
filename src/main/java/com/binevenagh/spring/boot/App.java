package com.binevenagh.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @project greeting-app
 * @description This is the main application class for the Greeting App.
 * It contains the entry point of the application.
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    private GreetingRunner greetingRunner;

    /**
     * Constructor for the App class.
     *
     * @param greetingRunner an instance of GreetingRunner used to execute the greeting logic
     */
    @Autowired
    public void DemoApplication(GreetingRunner greetingRunner) {
        this.greetingRunner = greetingRunner;
    }

    /**
     * The main method serves as the entry point of the application.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * This method is executed after the application context is loaded and started.
     * It delegates the execution to the GreetingRunner.
     *
     * @param args command-line arguments passed to the application
     */
    @Override
    public void run(String... args) {
        greetingRunner.run();
    }
}
