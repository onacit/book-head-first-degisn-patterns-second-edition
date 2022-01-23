package com.github.onacit.book.hfdpse.weatherstation;

import javax.measure.Quantity;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Pressure;
import javax.measure.quantity.Temperature;

class WeatherDataImpl
        implements IWeatherData {

    @Override
    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public Quantity<Dimensionless> getHumidity() {
        return humidity;
    }

    @Override
    public Pressure getPressure() {
        return pressure;
    }

    private Temperature temperature;

    private Quantity<Dimensionless> humidity;

    private Pressure pressure;
}
