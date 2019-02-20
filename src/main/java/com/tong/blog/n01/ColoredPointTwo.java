package com.tong.blog.n01;

/**
 * @Description: 博客地址：https://coolshell.cn/articles/1051.html
 * @Create: 2019/1/22 0022 上午 9:28
 */
public class ColoredPointTwo extends Point {

    private final Color color;

    public ColoredPointTwo(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof ColoredPointTwo) {
            ColoredPointTwo that = (ColoredPointTwo) other;
            result = (this.color.equals(that.color) && super.equals(that));
        } else if (other instanceof Point) {
            Point that = (Point) other;
            result = that.equals(this);
        }
        return result;
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColoredPointTwo redP = new ColoredPointTwo(1, 2, Color.RED);
        ColoredPointTwo blueP = new ColoredPointTwo(1, 2, Color.BLUE);
        System.out.println(redP.equals(p));//true
        System.out.println(p.equals(blueP));//true
        System.out.println(redP.equals(blueP));//false,違反equals()定義的傳遞性
    }
}
