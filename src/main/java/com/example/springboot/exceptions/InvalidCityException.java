package com.example.springboot.exceptions;

public class InvalidCityException extends Exception {
    private String cityName;

    public InvalidCityException(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String getMessage() {
        return "City " + cityName + " not found!";
    }
}
