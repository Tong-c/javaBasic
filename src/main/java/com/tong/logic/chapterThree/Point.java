package com.tong.logic.chapterThree;

public class Point {
    public int x;
    public int y;

    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
