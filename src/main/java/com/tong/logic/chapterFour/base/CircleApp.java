package com.tong.logic.chapterFour.base;

import com.tong.logic.chapterFour.base.Circle;
import com.tong.logic.chapterThree.Point;

public class CircleApp {

    public static void main(String[] args) {
        Point center = new Point(2, 3);
        Circle circle = new Circle(center, 2);
        circle.draw();

        System.out.println(circle.area());
    }
}
