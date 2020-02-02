package com.tong.practices.y2020.m02.day02;

public class ExceptionTest02 {

    public static void one() throws Exception {
        System.out.println("one 准备产生异常");
        throw new Exception("one 异常");
    }

    public static void two() throws Exception{
        try {
            one();
        } catch (Exception e) {
            System.out.println("two 捕获 one 异常（直接抛出），开始打印异常");
            e.printStackTrace();
            throw e;
        }
    }

    public static void three() throws Exception{
        try {
            one();
        } catch (Exception e) {
            System.out.println("three 捕获 one 异常（重置异常再抛出），开始打印异常");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            two();
        } catch (Exception e) {
            System.out.println("main 函数捕获 two 的异常，开始打印异常");
            e.printStackTrace(System.out);
        }

        System.out.println("================");

        try {
            three();
        } catch (Exception e) {
            System.out.println("main 函数捕获 three 的异常，开始打印异常");
            e.printStackTrace(System.out);
        }
    }
}
