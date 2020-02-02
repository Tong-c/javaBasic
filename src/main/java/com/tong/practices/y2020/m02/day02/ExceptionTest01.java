package com.tong.practices.y2020.m02.day02;

public class ExceptionTest01 {

    public void method1(int i) {
        if (i == 0) {
            throw new RuntimeException();
        }
    }

    public void method2() {
        method1(2);
    }
}
