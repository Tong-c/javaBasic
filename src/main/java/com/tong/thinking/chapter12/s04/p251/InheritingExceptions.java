package com.tong.thinking.chapter12.s04.p251;

/**
 * @author: Tong Chuang
 * @date: 2020/1/10
 */
public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException s) {
            System.out.println("Caught it!");
        }
    }
}
