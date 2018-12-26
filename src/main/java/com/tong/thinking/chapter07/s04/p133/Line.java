package com.tong.thinking.chapter07.s04.p133;

public class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + "," + end);
    }

    void dispose() {
        System.out.println("Erasing Line: " + start + "," + end);
        super.dispose();
    }
}
