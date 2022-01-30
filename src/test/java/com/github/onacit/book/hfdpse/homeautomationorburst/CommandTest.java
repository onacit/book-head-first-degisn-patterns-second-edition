package com.github.onacit.book.hfdpse.homeautomationorburst;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class CommandTest<T extends Command> {

    protected final Class<T> commandClass;
}