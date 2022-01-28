package com.github.onacit.book.hfdpse.starbuzzcoffee;

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
