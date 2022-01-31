package com.github.onacit.book.hfdpse.compound_pattern.simuduck_duck_simulator;

// Decorator
class QuackCounter
        implements Quackable {

    Quackable quackable;

    static int numberOfQuacks;

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    static int getQuacks() {
        return numberOfQuacks;
    }
}
