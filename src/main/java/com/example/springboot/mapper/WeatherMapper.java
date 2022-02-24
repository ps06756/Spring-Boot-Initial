package com.example.springboot.mapper;

import com.example.springboot.dto.WeatherDTO;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherMapper {
    public WeatherMapper() {

    }

    public WeatherDTO convertJSONToWeatherDTO(String json) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(json);
        JSONObject jsonObject = (JSONObject) obj;

        JSONObject locationObj = (JSONObject) jsonObject.get("location");
        String name = (String) locationObj.get("name");
        String region = (String) locationObj.get("region");

        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setRegionName(region);
        weatherDTO.setCityName(name);

        return weatherDTO;
    }
}
