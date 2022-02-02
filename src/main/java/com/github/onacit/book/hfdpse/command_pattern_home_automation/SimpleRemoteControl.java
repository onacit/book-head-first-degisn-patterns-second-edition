package com.github.onacit.book.hfdpse.command_pattern_home_automation;

class SimpleRemoteControl {

    void setCommand(Command command) {
        slot = command;
    }

    void buttonWasPressed() {
        slot.execute();
    }

    private Command slot;
}
