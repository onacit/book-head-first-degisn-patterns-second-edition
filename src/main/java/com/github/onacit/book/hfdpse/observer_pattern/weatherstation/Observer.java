package com.github.onacit.book.hfdpse.observer_pattern.weatherstation;

interface Observer {

    void update(float temp, float humidity, float pressure);
}
