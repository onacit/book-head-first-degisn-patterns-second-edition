package com.github.onacit.book.hfdpse.command_pattern_home_automation;

abstract class GarageDoorCommandTest<T extends GarageDoorCommand>
        extends CommandTest<T> {

    GarageDoorCommandTest(final Class<T> commandClass) {
        super(commandClass);
    }
}