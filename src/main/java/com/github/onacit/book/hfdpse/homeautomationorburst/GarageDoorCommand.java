package com.github.onacit.book.hfdpse.homeautomationorburst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
abstract class GarageDoorCommand
        implements Command {

    @Slf4j
    static
    class GarageDoor {

        void up() {
            log.debug("Garage Door is Open");
        }

        void down() {
        }

        void stop() {
        }

        void lightOn() {
        }

        void lightOff() {
        }
    }

    final GarageDoor garageDoor;
}
