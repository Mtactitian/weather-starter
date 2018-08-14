package com.alexb.weather.client;

import com.alexb.weather.model.WeatherInfo;

public interface WeatherClient {

    WeatherInfo getWeatherInfo(String city);

}
