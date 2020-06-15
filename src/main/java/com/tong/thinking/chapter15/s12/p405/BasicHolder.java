package com.tong.thinking.chapter15.s12.p405;

public class BasicHolder<T> {
    T element;

    void set(T arg) {
        this.element = arg;
    }

    T get() {
        return element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
