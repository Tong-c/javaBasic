package com.tong.thinking.chapter08.s02.p156;

public class PrivateOverride {
    //private方法子類不可見，無法重寫
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        ((Derived) po).f();
    }
}
