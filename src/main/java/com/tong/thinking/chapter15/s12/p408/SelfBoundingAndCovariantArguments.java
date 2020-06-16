package com.tong.thinking.chapter15.s12.p408;

public class SelfBoundingAndCovariantArguments {

    void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
        s1.set(s2);
//        s1.set(sbs);
    }
}
