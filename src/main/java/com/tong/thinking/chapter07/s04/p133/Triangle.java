package com.tong.thinking.chapter07.s04.p133;

public class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}
