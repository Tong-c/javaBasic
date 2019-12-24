package com.tong.logic.chapterFour.detail.four;

public class Base {
    public static int s;
    private int a;

    static {
        System.out.println("基類靜態代碼塊，s:" + s);
    }

    {
        System.out.println("基類實例代碼塊，a:" + a);
    }

    public Base() {
        System.out.println("基類構造方法：a" + a);
        a = 2;
    }

    protected void step() {
        System.out.println("base s: " + s + ",a:" + a);
    }

    public void action() {
        System.out.println("start");
        step();
        System.out.println("end");
    }


}
