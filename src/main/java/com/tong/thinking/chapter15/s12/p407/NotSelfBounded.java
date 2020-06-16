package com.tong.thinking.chapter15.s12.p407;

public class NotSelfBounded<T> {
    T element;

    NotSelfBounded<T> set(T args) {
        this.element = args;
        return this;
    }

    T get() {
        return element;
    }
}
