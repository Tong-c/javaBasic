package com.tong.thinking.chapter15.s11;

import net.mindview.util.RandomGenerator;

public class PrimitiveGenericTest {
    public static void main(String[] args) {
        String[] strings = FArray.fill(new String[7], new RandomGenerator.String());
        for (String s : strings) {
            System.out.println(s);
        }

        Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer());
        for (int i : integers) {
            System.out.println(i);
        }
    }
}
