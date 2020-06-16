package com.tong.thinking.chapter15.s12.p406;

public class C extends SelfBounded<C> {
    C setAndGet(C arg) {
        set(arg);
        return get();
    }
}
