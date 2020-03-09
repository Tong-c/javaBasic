package com.tong.thinking.chapter14.s02.p319;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.tong.thinking.chapter14.s02.p319.Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
