package com.github.onacit.book.hfdpse.proxy_pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
class Proxy
        implements Subject {

    Proxy(Subject subject) {
        super();
        this.subject = Objects.requireNonNull(subject, "subject is null");
    }

    @Override
    public void request() {
        log.debug("proxying request...");
        subject.request();
    }

    private final Subject subject;
}
