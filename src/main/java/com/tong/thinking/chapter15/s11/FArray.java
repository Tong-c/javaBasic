package com.tong.thinking.chapter15.s11;

import net.mindview.util.Generator;

public class FArray {

    public static <T> T[] fill(T[] a, Generator<T> gen) {
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }



}
