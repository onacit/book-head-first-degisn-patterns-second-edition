package com.github.onacit.book.hfdpse.homeautomationorburst;

class SimpleRemoteControl {

    void setCommand(Command command) {
        slot = command;
    }

    void buttonWasPressed() {
        slot.execute();
    }

    private Command slot;
}
