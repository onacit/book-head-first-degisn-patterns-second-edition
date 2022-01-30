package com.github.onacit.book.hfdpse.homeautomationorburst;

import org.junit.jupiter.api.Test;

class LightOnCommandTest
        extends CommandTest<LightOnCommand> {

    LightOnCommandTest() {
        super(LightOnCommand.class);
    }

    @Test
    void lightOn() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new LightCommand.Light());
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}