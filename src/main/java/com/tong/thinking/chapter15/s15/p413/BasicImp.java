package com.tong.thinking.chapter15.s15.p413;

public class BasicImp implements Basic {

    private String value;

    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}
