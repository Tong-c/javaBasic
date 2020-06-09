package com.tong.practices.y2020.m06.d09;

public class SubtypeTest {
    public static void main(String[] args) {

    }

    static <T> T wildSubtype(Holder<? extends T>   holder, T args) {
        return args;
    }

}
