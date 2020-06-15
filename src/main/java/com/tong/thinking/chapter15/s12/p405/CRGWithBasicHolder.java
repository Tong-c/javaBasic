package com.tong.thinking.chapter15.s12.p405;

public class CRGWithBasicHolder {
    public static void main(String[] args) {
        SubType st1 = new SubType();
        SubType st2 = new SubType();

        st1.set(st2);
        SubType st3 = st1.get();
        st1.f();
    }
}
