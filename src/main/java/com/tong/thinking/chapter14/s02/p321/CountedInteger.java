package com.tong.thinking.chapter14.s02.p321;

/**
 * @author: Tong Chuang
 * @date: 2020/3/16
 */
public class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return Long.toString(id);
    }
}
