package com.github.onacit.book.hfdpse.state_pattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Context {

    public void request() {
        state.handle();
    }

    private final State state;
}
