package com.example.springboot.service;

import com.example.springboot.accessor.WeatherAccessor;
import com.example.springboot.dao.WeatherDao;
import com.example.springboot.dto.WeatherDTO;
import com.example.springboot.exceptions.InvalidCityException;
import com.example.springboot.mapper.WeatherMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class WeatherService {
    private WeatherDao weatherDao;

    public WeatherDTO getWeather(String city, Integer noOfDays) throws InvalidCityException, UnirestException, ParseException {
        if (city.length() < 2) {
            throw new InvalidCityException(city);
        }

        WeatherDTO weatherDTO = weatherDao.getWeatherForCity(city, noOfDays);
        return weatherDTO;
    }
}
