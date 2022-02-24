package com.example.springboot;

import com.example.springboot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @Autowired
    private WeatherService weatherService;

}
