package com.github.onacit.book.hfdpse.command_pattern_home_automation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
abstract class LightCommand
        implements Command {

    @Slf4j
    static
    class Light {

        void on() {
            log.debug("i'm turning on");
        }

        void off() {
            log.debug("i'm turning off");
        }
    }

    final Light light;
}
