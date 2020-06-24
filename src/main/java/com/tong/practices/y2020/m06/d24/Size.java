package com.tong.practices.y2020.m06.d24;

public enum Size {
    X, M, S;

    public static void main(String[] args) {
        Size[] enumConstants = Size.class.getEnumConstants();
        System.out.println(enumConstants);
    }
}
