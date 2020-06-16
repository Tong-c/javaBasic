package com.tong.thinking.chapter15.s12.p406;

public class SelfBounded<T extends SelfBounded<T>> {

    T element;

    SelfBounded<T> set(T args) {
        element = args;
        return this;
    }

    T get() {
        return element;
    }



}
