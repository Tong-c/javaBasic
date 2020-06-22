package com.tong.thinking.chapter15.s17.p421;

import java.util.ArrayList;
import java.util.List;

public class ApplyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape());
        }

        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);

    }
}
