package com.alexb.weather.configuration;

import com.alexb.weather.client.WeatherClient;
import com.alexb.weather.client.WeatherClientImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherConfiguration {

    @Bean
    public WeatherClient weatherClient(@Value("weather.key.api") final String keyApi) {
        RestTemplate restTemplate = new RestTemplate();
        return new WeatherClientImpl(keyApi, restTemplate);
    }

}
