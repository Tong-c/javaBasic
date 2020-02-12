package com.tong.practices.y2020.m02.day12;

public class TestThrow {
    public static void main(String[] args) {
        try {
            throwChecked(-3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        throwRuntime(3);
    }

    private static void throwChecked(int a) throws Exception {
        if (a > 0) {
            throw new Exception("a 的值大于 0，不符合要求");
        }
    }


    private static void throwRuntime(int a) throws RuntimeException{
        if (a > 0) {
            throw new RuntimeException("a 的值大于 0，不符合要求");
        }
    }
}
