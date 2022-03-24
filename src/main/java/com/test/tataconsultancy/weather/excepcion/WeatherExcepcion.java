package com.test.tataconsultancy.weather.excepcion;

public class WeatherExcepcion extends Exception{

    public WeatherExcepcion(String message) {
        super(message);

    }
    public WeatherExcepcion(String message,Throwable cause) {
        super(message,cause);

    }
}
