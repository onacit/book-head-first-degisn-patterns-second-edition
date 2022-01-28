package com.github.onacit.book.hfdpse.starbuzzcoffee;

class Mocha
        extends CondimentDecorator {

    Mocha(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
