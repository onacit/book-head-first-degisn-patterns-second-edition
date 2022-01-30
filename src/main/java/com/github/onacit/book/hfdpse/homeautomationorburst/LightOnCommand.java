package com.github.onacit.book.hfdpse.homeautomationorburst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LightOnCommand
        extends LightCommand {

    LightOnCommand(final Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.on();
    }
}
