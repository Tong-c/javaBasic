package com.tong.thinking.chapter14.s02.p320;

/**
 * @author: Tong Chuang
 * @date: 2020/3/16
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
