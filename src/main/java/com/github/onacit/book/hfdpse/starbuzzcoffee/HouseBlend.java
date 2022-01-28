package com.github.onacit.book.hfdpse.starbuzzcoffee;

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
