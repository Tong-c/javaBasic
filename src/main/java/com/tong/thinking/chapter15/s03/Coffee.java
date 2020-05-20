package com.tong.thinking.chapter15.s03;

/**
 * @author: Tong Chuang
 * @date: 2020/5/19
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
