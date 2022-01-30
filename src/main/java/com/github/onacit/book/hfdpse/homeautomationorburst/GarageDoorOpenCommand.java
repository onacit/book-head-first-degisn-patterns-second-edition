package com.github.onacit.book.hfdpse.homeautomationorburst;

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
