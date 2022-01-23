package com.github.onacit.book.hfdpse.weatherstation;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Slf4j
class StatisticsConditionsDisplay
        implements Observer, DisplayElement {

    private static final int MAX_SIZE = 1024;

    StatisticsConditionsDisplay(final WeatherData weatherData) {
        super();
        this.weatherData = Objects.requireNonNull(weatherData, "weatherData is null");
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(0, temperature);
        if (temperatures.size() > MAX_SIZE) {
            temperatures.subList(MAX_SIZE, temperatures.size()).clear();
        }
        display();
    }

    @Override
    public void display() {
        DoubleSummaryStatistics statistics = temperatures.stream().mapToDouble(Double::valueOf).summaryStatistics();
        log.debug("Statistics: {}", statistics.toString());
    }

    private final WeatherData weatherData;

    private final List<Float> temperatures = new LinkedList<>();
}
