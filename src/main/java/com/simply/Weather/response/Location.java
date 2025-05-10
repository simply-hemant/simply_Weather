package com.simply.Weather.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private String name;
    private String country;
    private String region;
    private String localtime;
    private String timezone_id;


}
