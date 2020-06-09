package com.tong.thinking.chapter15.s10.p391;

import com.tong.thinking.chapter15.s10.Apple;
import com.tong.thinking.chapter15.s10.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
    }
}
