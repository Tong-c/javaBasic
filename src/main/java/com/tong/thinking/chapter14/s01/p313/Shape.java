package com.tong.thinking.chapter14.s01.p313;

public abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}
