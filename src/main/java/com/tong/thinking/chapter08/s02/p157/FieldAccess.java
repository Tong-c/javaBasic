package com.tong.thinking.chapter08.s02.p157;

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        //直接訪問字段，編譯期進行解析，不涉及多態
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());

    }
}
