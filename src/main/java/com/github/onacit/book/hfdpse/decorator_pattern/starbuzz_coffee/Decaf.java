package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

class Decaf
        extends Beverage {

    Decaf() {
        super();
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
