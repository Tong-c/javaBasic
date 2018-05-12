package com.tong.logic.chapterFour.detail.four;

public class Child extends Base {

    public static int s;
    private int a;
    static {
        System.out.println("子類靜態代碼塊，s:" + s);
        s = 10;
    }

    {
        System.out.println("子類實例代碼塊，a:" + a);
        a = 10;
    }

    public Child(){
        System.out.println("子類構造方法，a:" + a);
        a = 20;
    }

    protected void step(){
        System.out.println("child s:" + s + ",a :" + a);
    }



}
