package com.example.springboot;

import org.springframework.stereotype.Component;

//@Component
public class HelloAccessor {

    private String greeting;

    public HelloAccessor(String greetingToSet) {
        this.greeting = greetingToSet;
    }

    public String sendHello() {
        return this.greeting;
    }
}
