package com.github.onacit.book.hfdpse.state_pattern_mighty_gumball;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
class GumballMachine {

    GumballMachine(final int numberOfGumballs) {
        super();
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
        count = numberOfGumballs;
    }

    void insertQuarter() {
        state.insertQuarter();
    }

    void ejectQuarter() {
        state.ejectQuarter();
    }

    void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    private final State soldOutState;

    private final State noQuarterState;

    private final State hasQuarterState;

    private final State soldState;

    private final State winnerState;

    @Setter(AccessLevel.PACKAGE)
    @Getter
    private State state;

    private int count;
}
