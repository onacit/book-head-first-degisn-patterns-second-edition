package com.github.onacit.book.hfdpse.weatherstation;

import javax.measure.Quantity;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Pressure;
import javax.measure.quantity.Temperature;

interface IWeatherData {

    Temperature getTemperature();

    Quantity<Dimensionless> getHumidity();

    Pressure getPressure();
}
