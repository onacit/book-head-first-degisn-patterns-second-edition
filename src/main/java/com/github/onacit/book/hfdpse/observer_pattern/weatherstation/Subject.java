package com.github.onacit.book.hfdpse.observer_pattern.weatherstation;

interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
