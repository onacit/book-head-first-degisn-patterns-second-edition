package com.github.onacit.book.hfdpse.homeautomationorburst;

interface Command {

    Command NO_COMMAND = () -> {
        // does nothing!
    };

    void execute();

    default void undo() {
    }
}
