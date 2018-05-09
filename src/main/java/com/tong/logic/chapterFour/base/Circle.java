package com.tong.logic.chapterFour.base;

import com.tong.logic.chapterThree.Point;

public class Circle extends Shape {

    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }


    @Override
    public void draw() {
        System.out.println("draw circle at " + center.toString() + " with r " + r + ",using color :" + getColor());
    }

    public double area(){
        return Math.PI*r*r;
    }


}
