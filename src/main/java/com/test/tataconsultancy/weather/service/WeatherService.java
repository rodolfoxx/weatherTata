package com.test.tataconsultancy.weather.service;

import com.test.tataconsultancy.weather.dto.*;
import com.test.tataconsultancy.weather.repository.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WeatherService implements IWeatherService {

    private final
    Repository repository;
    @Value("${weather.url.data}")
    public String urlWeather;
    @Value("${weather.url.detail}")
    public String urlWeatherDetail;

    public WeatherService(Repository repository) {
        this.repository = repository;
    }

    public WeatherResponse dataWeather(WeatherRequest city) {

            Weather[] result = repository.
                    connection(urlWeather, city.getCity());
            return dataWeatherDetail(Arrays.stream(result).
                    findFirst().get().getWoeid());

    }

    public WeatherResponse dataWeatherDetail(Long woeid) {

        WeatherDetail result = repository.
                connectionDetail(urlWeatherDetail,woeid);

        WeatherResponse response = new WeatherResponse();
        List<Temperature> data = new ArrayList<>();

        for(ConsolidatedWeather weather :result.getConsolidatedWeather()) {

            Temperature temperature = new Temperature();

            temperature.setCelcius_temp(String.valueOf(weather.getTheTemp()));
            temperature.setFarenheit_temp(String.valueOf(celsiusAFahrenheit
                    (weather.getTheTemp().floatValue())));

            data.add(temperature);

        }

        response.setTemperature(data);

        return response;
    }


    public float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

}
