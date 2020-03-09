package com.tong.practices.y2020.m03.day09;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.tong.practices.y2020.m03.day09.InitClassOne");
        Class initClassTwo = InitClassTwo.class;
        System.out.println(StaticFinal.a);
        System.out.println(StaticNonFinal.b);
    }
}
