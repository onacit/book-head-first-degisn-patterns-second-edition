package com.github.onacit.book.hfdpse.homeautomationorburst;

abstract class GarageDoorCommandTest<T extends GarageDoorCommand>
        extends CommandTest<T> {

    GarageDoorCommandTest(final Class<T> commandClass) {
        super(commandClass);
    }
}