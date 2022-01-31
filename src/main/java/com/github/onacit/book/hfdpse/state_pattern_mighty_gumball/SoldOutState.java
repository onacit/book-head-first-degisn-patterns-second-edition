package com.github.onacit.book.hfdpse.state_pattern_mighty_gumball;

class SoldOutState
        extends State {

    SoldOutState(final GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispense() {
    }
}
