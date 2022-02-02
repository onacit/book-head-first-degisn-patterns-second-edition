package com.github.onacit.book.hfdpse.command_pattern_home_automation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class CommandTest<T extends Command> {

    protected final Class<T> commandClass;
}