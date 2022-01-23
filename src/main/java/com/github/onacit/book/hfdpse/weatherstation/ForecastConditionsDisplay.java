package com.github.onacit.book.hfdpse.weatherstation;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
class ForecastConditionsDisplay
        implements Observer, DisplayElement {

    ForecastConditionsDisplay(final WeatherData weatherData) {
        super();
        this.weatherData = Objects.requireNonNull(weatherData, "weatherData is null");
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        log.debug("Improving weather on the way!");
    }

    private final WeatherData weatherData;
}
