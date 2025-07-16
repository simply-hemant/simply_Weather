package com.simply.Weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                    "http://127.0.0.1:5500",                  // local testing
                    "https://simply-weather.onrender.com"     // your Render backend
                    // Add frontend domain here if hosted separately
                )
                .allowedMethods("GET")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
