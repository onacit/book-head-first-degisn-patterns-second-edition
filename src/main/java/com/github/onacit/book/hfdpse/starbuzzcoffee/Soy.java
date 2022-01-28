package com.github.onacit.book.hfdpse.starbuzzcoffee;

class Soy
        extends CondimentDecorator {

    Soy(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
