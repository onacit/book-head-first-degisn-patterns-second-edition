package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

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
