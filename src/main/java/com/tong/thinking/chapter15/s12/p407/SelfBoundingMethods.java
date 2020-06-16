package com.tong.thinking.chapter15.s12.p407;

import com.tong.thinking.chapter15.s12.p406.SelfBounded;

public class SelfBoundingMethods {

    static <T extends SelfBounded<T>> T f(T arg) {
        return null;
    }
}
