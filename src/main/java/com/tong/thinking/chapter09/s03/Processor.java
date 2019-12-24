package com.tong.thinking.chapter09.s03;

public class Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}
