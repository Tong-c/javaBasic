package com.tong.thinking.chapter14.s02.p321;

/**
 * @author: Tong Chuang
 * @date: 2020/3/16
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
