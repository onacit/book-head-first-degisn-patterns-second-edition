package com.github.onacit.book.hfdpse.decorator_pattern;

class ConcreteDecoratorA
        extends Decorator {

    ConcreteDecoratorA(final Component component) {
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

    void newBehavior() {
    }
}
