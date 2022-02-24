package com.example.springboot;

import com.example.springboot.accessor.WeatherAccessor;
import com.example.springboot.dto.WeatherDTO;
import com.example.springboot.exceptions.InvalidCityException;
import com.example.springboot.response.model.Weather;
import com.example.springboot.service.WeatherService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;


@RestController
public class HelloController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/weather/{city}/{noOfDays}")
	public ResponseEntity<Weather> index(@PathVariable("city") String city, @PathVariable("noOfDays") Integer noOfDays) {

		try {
			WeatherDTO weatherDTO = weatherService.getWeather(city, noOfDays);
			Weather weather = new Weather(weatherDTO.getCityName(), weatherDTO.getRegionName());
			return ResponseEntity.status(HttpStatus.OK).body(weather);
		}
		catch(InvalidCityException ex) {
			return ResponseEntity.badRequest().build();
		}
		catch(UnirestException ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} catch (ParseException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/def")
	public String index2() {
		return "Inside index2 method";
	}

}
