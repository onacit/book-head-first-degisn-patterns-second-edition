package com.github.onacit.book.hfdpse.proxy_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class RealSubject
        implements Subject {

    @Override
    public void request() {
        log.debug("handling request...");
    }
}
