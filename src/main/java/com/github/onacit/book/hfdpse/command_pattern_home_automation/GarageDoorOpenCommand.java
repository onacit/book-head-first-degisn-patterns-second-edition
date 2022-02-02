package com.github.onacit.book.hfdpse.command_pattern_home_automation;

class GarageDoorOpenCommand
        extends GarageDoorCommand {

    GarageDoorOpenCommand(final GarageDoor garageDoor) {
        super(garageDoor);
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
