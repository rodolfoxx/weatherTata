package com.test.tataconsultancy.weather.repository;

import com.test.tataconsultancy.weather.dto.Weather;
import com.test.tataconsultancy.weather.dto.WeatherDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class Repository  {

    public Weather[] connection(String url,Object param){

        WebClient webClient = WebClient.create(url);

        return  webClient.get().
                 uri(builder -> builder.path("/").
                         queryParam("query", param).build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(Weather[].class).block();

    }

    public WeatherDetail connectionDetail(String url,Object param){
        WebClient webClient = WebClient.create(url);

        return  webClient.get().uri("/"+ param + "/")
                .header(HttpHeaders.CONTENT_TYPE,
                        MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(WeatherDetail.class).block();

    }

}
