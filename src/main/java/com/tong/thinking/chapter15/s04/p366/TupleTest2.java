package com.tong.thinking.chapter15.s04.p366;


import com.tong.thinking.chapter15.s02.p356.Amphibian;
import com.tong.thinking.chapter15.s02.p356.Vehicle;
import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static com.tong.thinking.chapter15.s04.p366.Tuple.tuple;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class TupleTest2 {

    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h(){
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.12);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        TwoTuple<String, Integer> ttsi2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println();
    }
}
