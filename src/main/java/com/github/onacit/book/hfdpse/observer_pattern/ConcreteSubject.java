package com.github.onacit.book.hfdpse.observer_pattern;

import java.util.List;

class ConcreteSubject
        implements Subject {

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    List<Observer> observers;
}
