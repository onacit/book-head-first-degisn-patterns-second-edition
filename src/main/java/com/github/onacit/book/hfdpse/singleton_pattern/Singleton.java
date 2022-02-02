package com.github.onacit.book.hfdpse.singleton_pattern;

class Singleton {

    static Singleton uniqueInstance;

    static Singleton getInstance() {
        return uniqueInstance;
    }
}
