package com.tong.thinking.chapter15.s07.p372;

import java.util.ArrayList;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
