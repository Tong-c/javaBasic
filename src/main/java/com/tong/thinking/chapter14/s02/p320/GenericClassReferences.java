package com.tong.thinking.chapter14.s02.p320;

/**
 * @author: Tong Chuang
 * @date: 2020/3/16
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;

//        Class<Number> genericNumberClass = int.class;
    }
}
