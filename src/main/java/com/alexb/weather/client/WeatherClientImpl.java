package com.alexb.weather.client;

import com.alexb.weather.model.WeatherInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RequiredArgsConstructor
public class WeatherClientImpl implements WeatherClient {

    private final String UNITS_COMPONENT = "units";
    private final String CITY_COMPONENT = "q";
    private final String API_COMPONENT = "APPID";
    private final String UNITS_COMPONENT_VALUE = "metric";
    private final String API_URL = "https://api.openweathermap.org/data/2.5/weather";

    private final String apiKey;
    private final RestTemplate restTemplate;

    @Override
    public WeatherInfo getWeatherInfo(String city) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam(CITY_COMPONENT, city)
                .queryParam(API_COMPONENT, apiKey)
                .queryParam(UNITS_COMPONENT, UNITS_COMPONENT_VALUE);

        return restTemplate.getForObject(builder.toUriString(), WeatherInfo.class);
    }
}
