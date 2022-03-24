package com.test.tataconsultancy.weather.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Configuration
public class WebClentConfig {

@Bean
    public WebClient webClient(){

    return WebClient.builder().defaultHeader(HttpHeaders.
                            CONTENT_TYPE,
                    MediaType.APPLICATION_JSON_VALUE)
            .codecs(configurer->configurer.defaultCodecs().
                    maxInMemorySize(2*1024*1024)).build();



}

}
