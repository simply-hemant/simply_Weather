package com.simply.Weather.serviceImpl;

import com.simply.Weather.entiey.WeatherData;
import com.simply.Weather.repo.WeatherRepo;
import com.simply.Weather.response.WeatherResponse;
import com.simply.Weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {


    @Autowired
    private WeatherRepo weatherRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiTemplate;

    @Override
    public WeatherResponse getWeather(String city) {

        String finalAPI = apiTemplate.replace("CITY", city).replace("API_KEY", apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);

        WeatherResponse body = response.getBody();

        return body;

    }
}
