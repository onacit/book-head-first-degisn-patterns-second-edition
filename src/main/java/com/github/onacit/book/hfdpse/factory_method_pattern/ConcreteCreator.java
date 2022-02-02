package com.github.onacit.book.hfdpse.factory_method_pattern;

class ConcreteCreator
        extends Creator {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
