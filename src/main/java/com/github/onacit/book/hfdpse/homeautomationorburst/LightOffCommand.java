package com.github.onacit.book.hfdpse.homeautomationorburst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LightOffCommand
        extends LightCommand {

    LightOffCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.off();
    }
}
