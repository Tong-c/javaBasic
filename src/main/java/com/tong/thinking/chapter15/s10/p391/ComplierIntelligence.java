package com.tong.thinking.chapter15.s10.p391;

import com.tong.thinking.chapter15.s10.Apple;
import com.tong.thinking.chapter15.s10.Fruit;

import java.util.Arrays;
import java.util.List;

public class ComplierIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
