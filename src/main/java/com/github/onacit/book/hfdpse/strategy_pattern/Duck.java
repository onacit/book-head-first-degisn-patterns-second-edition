package com.github.onacit.book.hfdpse.strategy_pattern;

abstract class Duck {

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;
}
