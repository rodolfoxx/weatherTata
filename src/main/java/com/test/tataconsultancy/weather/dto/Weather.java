
package com.test.tataconsultancy.weather.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Weather {
    private String lattLong;
    private String locationType;
    private String title;
    private Long woeid;
}
