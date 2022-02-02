package com.github.onacit.book.hfdpse.observer_pattern_weather_station;

interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
