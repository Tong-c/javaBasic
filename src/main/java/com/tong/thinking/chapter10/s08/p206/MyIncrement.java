package com.tong.thinking.chapter10.s08.p206;

/**
 * @author: Tong Chuang
 * @date: 2019/12/12
 */
public class MyIncrement {

    public void increment() {
        System.out.println("other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}
