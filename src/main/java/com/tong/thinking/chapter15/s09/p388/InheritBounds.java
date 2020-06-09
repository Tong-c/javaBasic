package com.tong.thinking.chapter15.s09.p388;

import com.tong.thinking.chapter15.s09.Bounded;

public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}
