package com.tong.thinking.chapter08.s03.p163;

public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();//構造器調用多態方法，將會執行子類覆蓋方法，涉及到的子類成員變量使用默認值0或者null
        System.out.println("Glyph() after draw()");
    }
}
