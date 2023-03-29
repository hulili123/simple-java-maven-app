package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */

@RestController
@SpringBootApplication
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    public String getMessage() {
        return MESSAGE;
    }
}
