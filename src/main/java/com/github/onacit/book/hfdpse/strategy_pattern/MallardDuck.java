package com.github.onacit.book.hfdpse.strategy_pattern;

class MallardDuck
        extends Duck {

    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
