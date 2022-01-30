package com.github.onacit.book.hfdpse.homeautomationorburst;

class RemoteControl {

    static final int NUMBER_OF_SLOTS = 7;

    RemoteControl() {
        super();
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = Command.NO_COMMAND;
        }
        for (int i = 0; i < offCommands.length; i++) {
            offCommands[i] = Command.NO_COMMAND;
        }
    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    private final Command[] onCommands;

    private final Command[] offCommands;
}
