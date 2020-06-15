package com.tong.thinking.chapter15.s10.p393;

import com.tong.thinking.chapter15.s10.p389.Apple;
import com.tong.thinking.chapter15.s10.p389.Jonathan;

import java.util.List;

public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
    }
}
