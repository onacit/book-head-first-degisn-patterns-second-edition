package com.github.onacit.book.hfdpse.compound_pattern.simuduck_duck_simulator;

// Adapter
class GooseAdapter
        implements Quackable {

    GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    private Goose goose;
}
