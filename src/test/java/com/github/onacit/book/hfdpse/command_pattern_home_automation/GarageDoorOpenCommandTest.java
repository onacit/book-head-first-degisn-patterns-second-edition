package com.github.onacit.book.hfdpse.command_pattern_home_automation;

import org.junit.jupiter.api.Test;

class GarageDoorOpenCommandTest
        extends GarageDoorCommandTest<GarageDoorOpenCommand> {

    GarageDoorOpenCommandTest() {
        super(GarageDoorOpenCommand.class);
    }

    @Test
    void test() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoorCommand command = new GarageDoorOpenCommand(new GarageDoorCommand.GarageDoor());
        remote.setCommand(command);
        remote.buttonWasPressed();
    }
}