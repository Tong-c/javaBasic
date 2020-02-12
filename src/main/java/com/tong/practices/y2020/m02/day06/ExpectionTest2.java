package com.tong.practices.y2020.m02.day06;

public class ExpectionTest2 {
    public static boolean decide() {
        try {
            System.out.println("First");
            return true;
        } finally {
            System.out.println("Second");
            return false;
        }
    }

    public static void main(String[] args) {
        if (decide()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
