package com.example.springboot.dao;

import com.example.springboot.accessor.WeatherAccessor;
import com.example.springboot.dto.WeatherDTO;
import com.example.springboot.mapper.WeatherMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherDao {
    private WeatherAccessor weatherAccessor;
    private WeatherMapper weatherMapper;

    @Autowired
    public WeatherDao(WeatherAccessor weatherAccessor, WeatherMapper weatherMapper) {
        this.weatherAccessor = weatherAccessor;
        this.weatherMapper = weatherMapper;
    }

    public WeatherDTO getWeatherForCity(String city, int noOfDays) throws UnirestException, ParseException {
        HttpResponse<String> weatherResponse = weatherAccessor.getWeatherDetails(city, noOfDays);
        return weatherMapper.convertJSONToWeatherDTO(weatherResponse.getBody());
    }
}
