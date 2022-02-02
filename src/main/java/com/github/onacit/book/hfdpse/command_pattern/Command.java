package com.github.onacit.book.hfdpse.command_pattern;

interface Command {

    Command NO_COMMAND = () -> {
        // does nothing!
    };

    void execute();

    default void undo() {
    }
}
