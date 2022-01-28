package com.github.onacit.book.hfdpse.weatherstation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CurrentConditionsDisplay
        extends AbstractObserver
        implements DisplayElement {

    CurrentConditionsDisplay(final WeatherData weatherData) {
        super(weatherData);
        weatherData.registerObserver(this);
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

    private float temperature;

    private float humidity;
}
