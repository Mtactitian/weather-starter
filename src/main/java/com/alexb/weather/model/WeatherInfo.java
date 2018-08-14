package com.alexb.weather.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class WeatherInfo {
    private List<Weather> weather;
    private Main main;
    private String name;
}
