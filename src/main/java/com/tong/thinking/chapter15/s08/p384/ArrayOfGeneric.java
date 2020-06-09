package com.tong.thinking.chapter15.s08.p384;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Object[SIZE];
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<>();
    }
}
