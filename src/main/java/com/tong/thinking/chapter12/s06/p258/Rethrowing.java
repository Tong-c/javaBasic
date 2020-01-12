package com.tong.thinking.chapter12.s06.p258;

public class Rethrowing {

    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g().e.printStackTrace()");
        }
    }
}
