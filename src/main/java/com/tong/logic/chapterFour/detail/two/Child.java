package com.tong.logic.chapterFour.detail.two;

public class Child extends Base {

    public static String s = "child_base";
    public String m = "child";

    public static void staticTest() {
        System.out.println("child static:" + s);
    }

    public void objTest() {
        System.out.println("child");
    }
}
