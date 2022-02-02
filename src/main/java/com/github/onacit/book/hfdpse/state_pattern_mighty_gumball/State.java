package com.github.onacit.book.hfdpse.state_pattern_mighty_gumball;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class State {

    abstract void insertQuarter();

    abstract void ejectQuarter();

    abstract void turnCrank();

    abstract void dispense();

    final GumballMachine gumballMachine;
}
