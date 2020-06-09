package com.tong.thinking.chapter15.s11.p402;

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>(SIZE);
        for (String s : "A B C D E F G H I".split("  ")){
            strings.push(s);
        }

        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.println(s + "");
        }
    }
}
