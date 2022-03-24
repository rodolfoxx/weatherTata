package com.test.tataconsultancy.weather.service;

import com.test.tataconsultancy.weather.dto.WeatherRequest;
import com.test.tataconsultancy.weather.dto.WeatherResponse;

@FunctionalInterface
public interface IWeatherService {

    WeatherResponse dataWeather(WeatherRequest city);

}
