package com.tong.logic.chapterFour.detail.two;

public class ChildApp {
    public static void main(String[] args) {
        Child c = new Child();
        Base b = c;
        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();
        b.objTest();

        System.out.println(c.s);
        System.out.println(c.m);
        c.staticTest();
        b.objTest();
    }
}
