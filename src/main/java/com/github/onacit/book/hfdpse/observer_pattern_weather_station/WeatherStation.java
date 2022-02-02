package com.github.onacit.book.hfdpse.observer_pattern_weather_station;

class WeatherStation {

    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsConditionsDisplay statisticsDisplay = new StatisticsConditionsDisplay(weatherData);
        ForecastConditionsDisplay forecastDisplay = new ForecastConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 28.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("hello");
    }
}
