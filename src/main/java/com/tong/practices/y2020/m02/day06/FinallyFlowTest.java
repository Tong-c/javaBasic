package com.tong.practices.y2020.m02.day06;

public class FinallyFlowTest {

    public static int test() {
        int count = 5;
       try {
            throw new RuntimeException("测试异常");
        }  finally {
            System.out.println("finally 块被执行");
            return count;
        }
    }

    public static void main(String[] args) {
        int a = test();
        System.out.println(a);
    }
}
