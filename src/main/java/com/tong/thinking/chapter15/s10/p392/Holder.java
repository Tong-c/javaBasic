package com.tong.thinking.chapter15.s10.p392;


import com.tong.thinking.chapter15.s10.p389.Apple;
import com.tong.thinking.chapter15.s10.p389.Fruit;
import com.tong.thinking.chapter15.s10.p389.Orange;

public class Holder<T> {
    private T value;

    public Holder() {

    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }


    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);

        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        Orange c = (Orange) fruit.get();

    }
}
