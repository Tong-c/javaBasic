package com.tong.thinking.chapter08.s02.p158;

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();//基類構造從頂至下依次初始化，然後實例字段初始化，最後執行構造方法
    }
}
