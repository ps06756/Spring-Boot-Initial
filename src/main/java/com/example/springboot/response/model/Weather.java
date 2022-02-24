package com.example.springboot.response.model;

public class Weather {
    private String cityName;
    private String regionName;

    public Weather() {
    }

    public Weather(String cityName, String regionName) {
        this.cityName = cityName;
        this.regionName = regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
