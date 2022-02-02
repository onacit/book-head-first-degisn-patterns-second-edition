package com.github.onacit.book.hfdpse.observer_pattern_weather_station;

import lombok.extern.slf4j.Slf4j;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;

@Slf4j
class StatisticsConditionsDisplay
        implements Observer, DisplayElement {

    StatisticsConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperatures.add(temp);
        while (temperatures.size() > 100) {
            temperatures.removeFirst();
        }
        display();
    }

    @Override
    public void display() {
        DoubleSummaryStatistics statistics = temperatures.stream().mapToDouble(Double::valueOf).summaryStatistics();
        log.debug("Statistics: {}", statistics);
    }

    final WeatherData weatherData;

    private final LinkedList<Float> temperatures = new LinkedList<>();
}
