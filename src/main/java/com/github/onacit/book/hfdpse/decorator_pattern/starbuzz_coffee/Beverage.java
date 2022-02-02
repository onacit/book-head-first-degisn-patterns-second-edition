package com.github.onacit.book.hfdpse.decorator_pattern.starbuzz_coffee;

abstract class Beverage {

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    String description = "Unknown Beverage";
}
