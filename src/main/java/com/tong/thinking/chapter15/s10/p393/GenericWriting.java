package com.tong.thinking.chapter15.s10.p393;

import com.tong.thinking.chapter15.s10.p389.Apple;
import com.tong.thinking.chapter15.s10.p389.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<>();

    static List<Fruit> fruit = new ArrayList<>();

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
