package com.tong.thinking.chapter15.s15.p413;

public class Mixins {

    public static void main(String[] args) {
        Mixin mixin = new Mixin();
        Mixin mixin2 = new Mixin();
        mixin.set("test string 1");
        mixin.set("test string 2");
        System.out.println(mixin.get() + " " + mixin.getStamp() + " " + mixin.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
}
