package com.tong.practices.y2020.m02.day06;

public class ExpectionTest4 {

    public static int decide() {
        try {
            System.out.println("First");
            System.exit(0);
        } finally {
            System.out.println("Second");
            return 1;
        }
    }

    public static void main(String[] args) {
        if (decide() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
