package com.github.onacit.book.hfdpse.decorator_pattern;

abstract class Decorator
        implements Component {

    protected Decorator(final Component component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        component.methodA();
    }

    @Override
    public void methodB() {
        component.methodB();
    }

    protected final Component component;
}
