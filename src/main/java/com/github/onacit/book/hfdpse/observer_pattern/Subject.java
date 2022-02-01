package com.github.onacit.book.hfdpse.observer_pattern;

interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
