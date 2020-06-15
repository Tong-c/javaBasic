package com.tong.thinking.chapter15.s12.p405;

public class Unconstrained {

    public static void main(String[] args) {
        BasicOther b = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
}
