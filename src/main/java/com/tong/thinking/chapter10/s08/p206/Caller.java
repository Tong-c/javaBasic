package com.tong.thinking.chapter10.s08.p206;

/**
 * @author: Tong Chuang
 * @date: 2019/12/12
 */
public class Caller {

    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}
