package com.github.onacit.book.hfdpse.starbuzzcoffee;

class Whip
        extends CondimentDecorator {

    Whip(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
