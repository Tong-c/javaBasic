package com.tong.thinking.chapter07.s04.p133;

public class Circle extends Shape {

    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }


}
