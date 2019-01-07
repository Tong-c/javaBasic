package com.tong.thinking.chapter08.s02.p156;

public class Derived extends PrivateOverride {
    //父類同名方法為private修飾，所以此方法為全新方法
    public void f() {
        System.out.println("public f()");
    }
}
