package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

class HouseBlend
        extends Beverage {

    HouseBlend() {
        super();
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
