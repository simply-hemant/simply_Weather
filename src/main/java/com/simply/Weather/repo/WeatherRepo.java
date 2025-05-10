package com.simply.Weather.repo;

import com.simply.Weather.entiey.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherData, Long> {


}
