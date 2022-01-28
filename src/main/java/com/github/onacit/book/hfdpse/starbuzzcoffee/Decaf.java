package com.github.onacit.book.hfdpse.starbuzzcoffee;

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
