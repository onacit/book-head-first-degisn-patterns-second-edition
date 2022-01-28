package com.github.onacit.book.hfdpse.weatherstation;

import java.util.Objects;

abstract class AbstractObserver
        implements Observer {

    protected AbstractObserver(final WeatherData weatherData) {
        super();
        this.weatherData = Objects.requireNonNull(weatherData, "weatherData is null");
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        update(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());
    }

    protected final WeatherData weatherData;
}
