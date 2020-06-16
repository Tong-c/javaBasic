package com.tong.thinking.chapter15.s12.p408;

import com.tong.thinking.chapter15.s12.p407.Derived;

public class DerivedSetter extends OrdinarySetter {

    void set(Derived derived) {
        System.out.println("DerivedSetter.set(Derived)");
    }
}
