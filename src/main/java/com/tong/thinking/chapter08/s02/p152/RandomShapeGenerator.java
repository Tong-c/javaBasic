package com.tong.thinking.chapter08.s02.p152;

import java.util.Random;

//簡單工廠模式
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();//向上轉型，返回基類引用
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
