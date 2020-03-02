package com.tong.practices.y2020.m03.day02;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("try 抛出异常");
        }  finally {
           return;
        }
    }
}
