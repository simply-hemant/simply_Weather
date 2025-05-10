package com.simply.Weather.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {

    private Request request;
    private Location location;
    private Current current;

}
