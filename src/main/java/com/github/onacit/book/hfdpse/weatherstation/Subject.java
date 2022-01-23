package com.github.onacit.book.hfdpse.weatherstation;

interface Subject {

    boolean registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
