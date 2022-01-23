package com.github.onacit.book.hfdpse.weatherstation;

interface Observer {

    void update(float temp, float humidity, float pressure);
}
