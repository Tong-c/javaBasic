package com.tong.thinking.chapter10.s08.p206;

/**
 * @author: Tong Chuang
 * @date: 2019/12/12
 */
public class Callee1 implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
