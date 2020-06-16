package com.tong.thinking.chapter15.s12.p408;

import com.tong.thinking.chapter15.s12.p407.Base;
import com.tong.thinking.chapter15.s12.p407.Derived;

public class OrdinaryArguments {

    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base);
    }
}
