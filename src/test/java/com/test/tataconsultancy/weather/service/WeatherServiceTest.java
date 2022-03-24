package com.test.tataconsultancy.weather.service;

import com.test.tataconsultancy.weather.dto.*;
import com.test.tataconsultancy.weather.repository.Repository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

class WeatherServiceTest {

    @InjectMocks
    WeatherService weatherService;
    @Mock
    WeatherService mockWeatherService;
    @Mock
    Repository mockRepository;
    @Mock
    WeatherDetail mockWeatherDetail;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(weatherService, "repository", mockRepository);
        ReflectionTestUtils.setField(weatherService, "urlWeather", "test");
        ReflectionTestUtils.setField(weatherService, "urlWeatherDetail", "test");

    }

    @Test
    void dataWeather() {

        WeatherRequest weather = new  WeatherRequest();
        weather.setCity("test");

        Weather weatherData = new  Weather();
        weatherData.setWoeid(1111L);

        Weather[] weatherArray = new  Weather[0];

        WeatherDetail weatherDetail = new WeatherDetail();
        weatherDetail.setLattLong("test");

        when(mockRepository.connection("test","test")).thenReturn(weatherArray);
        when(mockRepository.connectionDetail("test","test")).thenReturn(weatherDetail);

        WeatherResponse consolidate = weatherService.dataWeather(weather);
    }

    @Test
    void dataWeatherDetail() {

        WeatherDetail weatherDetail = new WeatherDetail();
        weatherDetail.setLattLong("test");

        ConsolidatedWeather test = new  ConsolidatedWeather();
        List<ConsolidatedWeather> consolidate = new ArrayList<>();
        test.setWeatherStateName("test");
        test.setTheTemp(11.9);

        consolidate.add(test);

        when(mockRepository.connectionDetail(Mockito.any(),Mockito.any())).thenReturn(mockWeatherDetail);
        when(mockWeatherDetail.getConsolidatedWeather()).thenReturn(consolidate);
        when(mockWeatherService.celsiusAFahrenheit(Mockito.anyFloat())).thenReturn(Mockito.anyFloat());
        WeatherResponse consolidateEnd = weatherService.dataWeatherDetail(111L);
        Assertions.assertThat(consolidateEnd).isNotNull();
    }
}