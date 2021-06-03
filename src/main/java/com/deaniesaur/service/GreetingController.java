package com.deaniesaur.service;

import com.deaniesaur.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String name = "Deaniesaur";
    private static final String message = "Hello World";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        Greeting greeting = new Greeting();
        greeting.setName(name);
        greeting.setContent(message);
        return greeting;
    }

    @GetMapping("/square")
    public String square(@RequestParam(value = "number", defaultValue = "0.0") double number){
        System.out.println("Number = " + number);
        return "Square of " + number + " = " + Math.pow(number, 2);
    }
}
