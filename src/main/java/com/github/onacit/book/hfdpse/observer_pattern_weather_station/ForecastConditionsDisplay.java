package com.github.onacit.book.hfdpse.observer_pattern_weather_station;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ForecastConditionsDisplay
        implements Observer, DisplayElement {

    ForecastConditionsDisplay(WeatherData weatherData) {
        super();
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    }

    @Override
    public void display() {
        log.debug("Improving weather on the way!");
    }

    final WeatherData weatherData;
}
