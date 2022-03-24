package com.test.tataconsultancy.weather.controller;

import com.test.tataconsultancy.weather.dto.ConsolidatedWeather;
import com.test.tataconsultancy.weather.dto.WeatherRequest;
import com.test.tataconsultancy.weather.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    IWeatherService weatherService;

    @RequestMapping("/weather")
    public ConsolidatedWeather weather(@RequestBody WeatherRequest weather) {
        System.out.println("==== in weather ====");
         return weatherService.dataWeather(weather);
    }
}
