package com.github.onacit.book.hfdpse.adapter_pattern.object_adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class Adapter
        implements Target {

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    final Adaptee adaptee;
}
