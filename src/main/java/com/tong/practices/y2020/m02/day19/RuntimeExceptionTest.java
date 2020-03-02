package com.tong.practices.y2020.m02.day19;

public class RuntimeExceptionTest {

    private static void method1() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("异常被捕获");
            e.printStackTrace();
        }
    }
}
