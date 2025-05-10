package com.simply.Weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS requests from your frontend domain (e.g., http://localhost:3000)
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500")  // Add your frontend URL here
                .allowedMethods("GET")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
