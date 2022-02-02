package com.github.onacit.book.hfdpse.decorator_pattern;

class ConcreteDecoratorB
        extends Decorator {

    ConcreteDecoratorB(final Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        super.methodA();
    }

    @Override
    public void methodB() {
        super.methodB();
    }

    private Object newState;
}
