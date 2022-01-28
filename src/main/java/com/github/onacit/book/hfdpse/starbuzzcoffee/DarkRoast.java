package com.github.onacit.book.hfdpse.starbuzzcoffee;

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
