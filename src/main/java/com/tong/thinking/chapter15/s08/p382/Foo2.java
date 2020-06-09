package com.tong.thinking.chapter15.s08.p382;


public class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }

}
