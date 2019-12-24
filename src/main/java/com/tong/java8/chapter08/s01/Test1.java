package com.tong.java8.chapter08.s01;

/**
 * @author: Tong Chuang
 * @date: 2019/11/15
 */
public class Test1 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello r1");
            }
        };

        Runnable r2 = () -> System.out.println("hello r2");

    }
}
