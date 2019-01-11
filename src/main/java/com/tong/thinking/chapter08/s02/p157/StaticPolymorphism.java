package com.tong.thinking.chapter08.s02.p157;

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());//靜態方法與類關聯，與對象無關
        System.out.println(sup.dynamicGet());//實例方法多態調用
    }
}
