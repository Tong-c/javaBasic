package com.tong.logic.chapterThree;

public class LineApp {

    public static void main(String[] args) {
        Point start = new Point(2, 3);
        Point end = new Point(3, 4);
        Line line = new Line(start, end);
        System.out.println(line.length());
    }
}
