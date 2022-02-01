package com.github.onacit.book.hfdpse.observer_pattern.weatherstation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
class WeatherData
        implements Subject {

    WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
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

    List<Observer> observers;

    float temperature;

    float humidity;

    float pressure;
}
