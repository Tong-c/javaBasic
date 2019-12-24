package com.tong.thinking.chapter10.s08.p206;

/**
 * @author: Tong Chuang
 * @date: 2019/12/12
 */
public class Callee2 extends MyIncrement {

    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }

}
