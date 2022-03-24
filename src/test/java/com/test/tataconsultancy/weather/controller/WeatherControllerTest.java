package com.test.tataconsultancy.weather.controller;

import com.test.tataconsultancy.weather.dto.ConsolidatedWeather;
import com.test.tataconsultancy.weather.dto.WeatherRequest;
import com.test.tataconsultancy.weather.service.IWeatherService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Mockito.when;

class WeatherControllerTest{

    @InjectMocks
    WeatherController controller;
    @Mock
    WeatherController mockController;
    @Mock
    IWeatherService mockIWeatherService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(mockController, "weatherService", mockIWeatherService);

    }

    @Test
    void weather() {

        WeatherRequest weather = new  WeatherRequest();
        weather.setCity("test");

        ConsolidatedWeather consolidatedWeather = new ConsolidatedWeather();
        consolidatedWeather.setWeatherStateAbbr("test");

        when(mockIWeatherService.dataWeather(weather)).thenReturn(consolidatedWeather);
        ConsolidatedWeather result =  controller.weather(weather);
        Assertions.assertThat(result).isNotNull();

    }
}