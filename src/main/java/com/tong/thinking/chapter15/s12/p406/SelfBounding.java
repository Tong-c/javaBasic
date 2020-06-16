package com.tong.thinking.chapter15.s12.p406;

public class SelfBounding {

    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c.setAndGet(new C());
    }
}
