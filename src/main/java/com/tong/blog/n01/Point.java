package com.tong.blog.n01;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description: 博客地址：https://coolshell.cn/articles/1051.html
 * @Create: 2019/1/22 0022 上午 9:28
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY() {
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Point) {
            Point that = (Point) other;
            result = (this.getX() == this.getX() && this.getY() == that.getY());
        }
        return result;
    }

    @Override
    public int hashCode() {
        return (41 * (41 + getX()) + getY());
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        HashSet<Point> coll = new HashSet<>();
        coll.add(p);
        System.out.println(coll.contains(p));//true

        //改變p的一個域
        p.setX(p.getX() + 1);
        System.out.println(coll.contains(p));//false

        //通過集合的迭代器來檢查是否包含p
        Iterator<Point> it = coll.iterator();
        boolean containedP = false;
        while (it.hasNext()) {
            Point nextP = it.next();
            if (nextP.equals(p)) {
                containedP = true;
                break;
            }
        }
        System.out.println(containedP);//true
    }
}
