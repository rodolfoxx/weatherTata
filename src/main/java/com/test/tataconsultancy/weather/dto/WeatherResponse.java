
package com.test.tataconsultancy.weather.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WeatherResponse {

   public List<Temperature> temperature;

}
