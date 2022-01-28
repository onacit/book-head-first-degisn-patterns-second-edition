package com.github.onacit.book.hfdpse.weatherstation;

import lombok.extern.slf4j.Slf4j;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;

@Slf4j
class StatisticsConditionsDisplay
        extends AbstractObserver
        implements DisplayElement {

    private static final int MAX_SIZE = 1024;

    StatisticsConditionsDisplay(final WeatherData weatherData) {
        super(weatherData);
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

    private final List<Float> temperatures = new LinkedList<>();
}
