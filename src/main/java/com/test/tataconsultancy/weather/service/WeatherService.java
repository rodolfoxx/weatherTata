package com.test.tataconsultancy.weather.service;

import com.test.tataconsultancy.weather.dto.ConsolidatedWeather;
import com.test.tataconsultancy.weather.dto.WeatherDetail;
import com.test.tataconsultancy.weather.dto.WeatherRequest;
import com.test.tataconsultancy.weather.dto.Weather;
import com.test.tataconsultancy.weather.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

@Service
public class WeatherService implements IWeatherService {

    @Autowired
    Repository repository;
    @Value("${weather.url.data}")
    public String urlWeather;
    @Value("${weather.url.detail}")
    public String urlWeatherDetail;

    public ConsolidatedWeather dataWeather(WeatherRequest city) {

            Weather[] result = repository.
                    connection(urlWeather, city.getCity());
            return dataWeatherDetail(Arrays.stream(result).
                    findFirst().get().getWoeid());

    }

    public ConsolidatedWeather dataWeatherDetail(Long woeid) {

        WeatherDetail result = repository.
                connectionDetail(urlWeatherDetail,woeid);
        return  result.getConsolidatedWeather().
                get(result.getConsolidatedWeather().size() -1);

    }

}
