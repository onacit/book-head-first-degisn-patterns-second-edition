package com.github.onacit.book.hfdpse.adapter_pattern.class_adapter;

class Adapter
        implements Target, Adaptee {

    @Override
    public void request() {
        specificRequest();
    }

    @Override
    public void specificRequest() {
    }
}
