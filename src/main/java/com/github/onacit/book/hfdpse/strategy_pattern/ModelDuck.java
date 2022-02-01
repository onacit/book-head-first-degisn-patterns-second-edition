package com.github.onacit.book.hfdpse.strategy_pattern;

class ModelDuck
        extends Duck {

    ModelDuck() {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
