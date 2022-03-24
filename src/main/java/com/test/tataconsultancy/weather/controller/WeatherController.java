package com.test.tataconsultancy.weather.controller;

import com.test.tataconsultancy.weather.dto.WeatherRequest;
import com.test.tataconsultancy.weather.dto.WeatherResponse;
import com.test.tataconsultancy.weather.service.IWeatherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final
    IWeatherService weatherService;

    public WeatherController(IWeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping("/weather")
    public WeatherResponse weather(@RequestBody WeatherRequest weather) {
        System.out.println("==== in weather ====");
         return weatherService.dataWeather(weather);
    }
}
