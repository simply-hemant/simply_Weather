package com.simply.Weather.service;

import com.simply.Weather.entiey.WeatherData;
import com.simply.Weather.response.WeatherResponse;

public interface WeatherService {

    WeatherResponse getWeather(String city);

}
