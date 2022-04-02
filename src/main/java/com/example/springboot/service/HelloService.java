package com.example.springboot.service;

import com.example.springboot.HelloAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class HelloService {

//    @Autowired
    private HelloAccessor helloAccessor;

    public HelloService(HelloAccessor helloAccessor) {
        this.helloAccessor = helloAccessor;
    }

    public String sendHello() {
        return helloAccessor.sendHello();
    }
}
