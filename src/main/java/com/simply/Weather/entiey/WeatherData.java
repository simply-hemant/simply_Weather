package com.simply.Weather.entiey;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class  WeatherData {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String country;
    private String region;
    private String timezone_id;

    @Column(name = "local_time_str") // ✅ avoids conflict with reserved keyword
    private String localTimeStr;

    private String description;
    private String observationTime;
    private int temperature;
    private int wind_speed;
    private int humidity;
    
}
