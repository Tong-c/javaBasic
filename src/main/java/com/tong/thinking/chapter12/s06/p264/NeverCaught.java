package com.tong.thinking.chapter12.s06.p264;

public class NeverCaught {
    static void f() {
        throw new RuntimeException("from f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
