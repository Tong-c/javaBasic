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

    public static void h() {
        try {
            f();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
