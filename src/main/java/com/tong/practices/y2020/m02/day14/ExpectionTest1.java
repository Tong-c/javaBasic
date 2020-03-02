package com.tong.practices.y2020.m02.day14;

import javax.xml.soap.Text;

public class ExpectionTest1 {

    public static void throwException() throws TestException {
        throw new TestException();
    }

    public static void method2()  throws TestException{
        try {
            throwException();
        } catch (TestException e) {
            e.fillInStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
