package com.alexb.weather.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Objects;

public class WeatherValuePostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        final String keyApi = "weather.key.api";
        Objects.requireNonNull(environment.getProperty(keyApi),
                String.format("%s cannot be null", keyApi));

    }
}
