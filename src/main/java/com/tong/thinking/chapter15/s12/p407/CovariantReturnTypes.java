package com.tong.thinking.chapter15.s12.p407;

public class CovariantReturnTypes {

    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }

}
