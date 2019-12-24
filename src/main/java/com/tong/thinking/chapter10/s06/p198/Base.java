package com.tong.thinking.chapter10.s06.p198;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}
