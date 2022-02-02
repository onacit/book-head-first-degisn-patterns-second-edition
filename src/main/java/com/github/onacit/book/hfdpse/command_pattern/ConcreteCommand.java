package com.github.onacit.book.hfdpse.command_pattern;

class ConcreteCommand
        implements Command {

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
    }

    Receiver receiver;
}
