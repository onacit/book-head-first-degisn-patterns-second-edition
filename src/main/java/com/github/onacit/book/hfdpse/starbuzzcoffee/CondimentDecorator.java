package com.github.onacit.book.hfdpse.starbuzzcoffee;

import java.util.Objects;

abstract class CondimentDecorator
        extends Beverage {

    protected CondimentDecorator(final Beverage beverage) {
        super();
        this.beverage = Objects.requireNonNull(beverage, "beverage is null");
    }

    @Override
    public abstract String getDescription();

    protected final Beverage beverage;
}
