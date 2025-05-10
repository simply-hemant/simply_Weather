package com.simply.Weather.controller;

import com.simply.Weather.response.WeatherResponse;
import com.simply.Weather.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/test")
    public String test(){
        return "weather app";
    }

    @GetMapping("/city")
    public ResponseEntity<?> weather(@RequestParam String city)
    {
       WeatherResponse weatherResponse = weatherService.getWeather(city);

        String weather = "";

        if (weatherResponse != null) {

            weather = "City: " + weatherResponse.getLocation().getName() + "\n "
                    + "Country: " + weatherResponse.getLocation().getCountry() + "\n"
                    + "Weather: " + String.join(", ", weatherResponse.getCurrent().getWeather_descriptions()) + "\n"
                    + "Temperature: " + weatherResponse.getCurrent().getTemperature() + "°C\n"
                    + "Humidity: " + weatherResponse.getCurrent().getHumidity() + "%\n"
                    + "Pressure: " + weatherResponse.getCurrent().getPressure() + " hPa\n"
                    + "Observation Time: " + weatherResponse.getCurrent().getObservation_time() + "\n"
                    + "Request Details: " + weatherResponse.getRequest().getQuery() + "\n"
                    + "Region: " + weatherResponse.getLocation().getRegion() + "\n"
                    + "WindSpeed: " + weatherResponse.getCurrent().getWind_speed() + "\n"
                    + "Time Zone: " + weatherResponse.getLocation().getTimezone_id();
        }
        return new ResponseEntity<>(weather, HttpStatus.OK);

    }

}
