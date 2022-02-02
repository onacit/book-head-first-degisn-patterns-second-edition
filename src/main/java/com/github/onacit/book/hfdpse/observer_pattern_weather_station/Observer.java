package com.github.onacit.book.hfdpse.observer_pattern_weather_station;

interface Observer {

    void update(float temp, float humidity, float pressure);
}
