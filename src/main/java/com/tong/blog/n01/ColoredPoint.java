package com.tong.blog.n01;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 博客地址：https://coolshell.cn/articles/1051.html
 * @Create: 2019/1/22 0022 上午 9:28
 */
public class ColoredPoint extends Point {

    private final Color color;

    public ColoredPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof ColoredPoint) {
            ColoredPoint that = (ColoredPoint) other;
            result = (this.color.equals(that.color) && super.equals(that));
        }
        return result;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColoredPoint cp = new ColoredPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp));//true
        System.out.println(cp.equals(p));//false，違反equals()定義的等價性

        Set<Point> hashSet1 = new HashSet<>();
        hashSet1.add(p);
        System.out.println(hashSet1.contains(cp));//false

        Set<Point> hashSet2 = new HashSet<>();
        hashSet2.add(cp);
        System.out.println(hashSet2.contains(p));//true
    }
}
