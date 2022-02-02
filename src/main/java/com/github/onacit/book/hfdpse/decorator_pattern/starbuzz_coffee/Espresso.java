package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

class Espresso
        extends Beverage {

    Espresso() {
        super();
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
