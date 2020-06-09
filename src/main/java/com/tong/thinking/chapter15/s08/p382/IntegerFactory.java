package com.tong.thinking.chapter15.s08.p382;

public class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}
