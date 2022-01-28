package com.github.onacit.book.hfdpse.weatherstation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

class WeatherData
        implements Subject {

    @Override
    public boolean registerObserver(final Observer observer) {
        Objects.requireNonNull(observer, "observer is null");
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(final Observer observer) {
        Objects.requireNonNull(observer, "observer is null");
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (final Observer observer : observers) {
            if (ThreadLocalRandom.current().nextBoolean()) {
                observer.update(temperature, humidity, pressure);
            } else {
                observer.update();
            }
        }
    }

    void measurementChanged() {
        notifyObservers();
    }

    void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private final List<Observer> observers = new CopyOnWriteArrayList<>();

    @Setter(AccessLevel.PACKAGE)
    @Getter
    private float temperature;

    @Setter(AccessLevel.PACKAGE)
    @Getter
    private float humidity;

    @Setter(AccessLevel.PACKAGE)
    @Getter
    private float pressure;

    private final IWeatherData weatherData = new WeatherDataImpl();
}
