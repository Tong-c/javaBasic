package com.tong.logic.chapterFive;

public class OuterTwo {
    private int a = 100;

    public class Inner {
        public void innerMethod() {
            System.out.println("outer a " + a);
            OuterTwo.this.action();
        }
    }

    private void action() {
        System.out.println("action");
    }

    public void test() {
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
