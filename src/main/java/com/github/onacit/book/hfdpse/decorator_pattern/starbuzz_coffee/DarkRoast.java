package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

class DarkRoast
        extends Beverage {

    DarkRoast() {
        super();
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
