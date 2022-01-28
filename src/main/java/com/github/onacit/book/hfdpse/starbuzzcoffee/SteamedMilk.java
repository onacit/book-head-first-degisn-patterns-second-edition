package com.github.onacit.book.hfdpse.starbuzzcoffee;

class SteamedMilk
        extends CondimentDecorator {

    SteamedMilk(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
