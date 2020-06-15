package com.tong.thinking.chapter15.s10.p394;

import com.tong.thinking.chapter15.s10.p389.Apple;
import com.tong.thinking.chapter15.s10.p389.Fruit;

import java.util.Arrays;
import java.util.List;

public class GenericReading {

    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static void f1() {
        Apple a = readExact(apples);
        Fruit f = readExact(fruit);
        f = readExact(apples);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<>();

    }
}
