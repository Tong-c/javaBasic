package com.tong.logic.chapterFour.detail.two;

public class Base {

    public static String s = "static_base";
    public String m = "base";

    public static void staticTest() {
        System.out.println("base static:" + s);
    }

    public void objTest() {
        System.out.println("base");
    }
}
