package com.simply.Weather.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Current {

    private String observation_time;
    private Double temperature;
    private Integer humidity;
    private Integer pressure;
    private List<String> weather_descriptions;
    private int wind_speed;

}
