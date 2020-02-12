package com.tong.practices.y2020.m02.day06;

import java.io.IOException;

public class ExpectionTest5 {

    public static void test1() {
        try {
            System.out.println("catch");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


    public static void test2() {
        try {
            System.out.println("catch");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /*public static void test3() {
        try {
            System.out.println("catch");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /*public static void test4() {
        try {
            System.out.println("catch");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/


    public static void test5() {
        try {
            System.out.println("catch");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
