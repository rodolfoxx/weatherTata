package com.test.tataconsultancy.weather.service;

import com.test.tataconsultancy.weather.dto.ConsolidatedWeather;
import com.test.tataconsultancy.weather.dto.WeatherRequest;

@FunctionalInterface
public interface IWeatherService {

    public ConsolidatedWeather dataWeather(WeatherRequest city);

}
