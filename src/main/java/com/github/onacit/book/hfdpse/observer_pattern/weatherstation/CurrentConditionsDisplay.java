package com.github.onacit.book.hfdpse.observer_pattern.weatherstation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CurrentConditionsDisplay
        implements Observer, DisplayElement {

    CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        log.debug("Current conditions: {}F decrees and {}% humidity", temperature, humidity);
    }

    final WeatherData weatherData;

    private float temperature;

    private float humidity;
}
