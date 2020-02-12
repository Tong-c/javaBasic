package com.tong.practices.y2020.m02.day06;

public class ExpectionTest3 {

    public static int getLength(String s) {
        try {
            int i = s.length();
            return i;
        } catch (Exception e) {
            return 0;
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLength("tom"));
        System.out.println(getLength(null));
    }
}
