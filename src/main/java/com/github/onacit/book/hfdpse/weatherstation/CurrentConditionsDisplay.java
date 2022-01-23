package com.github.onacit.book.hfdpse.weatherstation;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
class CurrentConditionsDisplay
        implements Observer, DisplayElement {

    CurrentConditionsDisplay(final WeatherData weatherData) {
        super();
        this.weatherData = Objects.requireNonNull(weatherData, "weatherData is null");
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        log.debug("Current conditions: {}F decrees and {}% humidity", temperature, humidity);
    }

    private final WeatherData weatherData;

    private float temperature;

    private float humidity;
}
