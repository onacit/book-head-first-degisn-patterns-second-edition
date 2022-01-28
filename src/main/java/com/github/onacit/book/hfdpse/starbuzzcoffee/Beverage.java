package com.github.onacit.book.hfdpse.starbuzzcoffee;

abstract class Beverage {

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    String description = "Unknown Beverage";
}
