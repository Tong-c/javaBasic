package com.tong.thinking.chapter15.s12.p408;

public class GenericsAndReturnTypes {

    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get();
    }
}
