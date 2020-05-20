package com.tong.thinking.chapter15.s05.p369;

import com.tong.thinking.chapter07.s04.Custom;
import net.mindview.util.Generator;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
