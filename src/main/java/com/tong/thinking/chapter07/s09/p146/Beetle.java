package com.tong.thinking.chapter07.s09.p146;

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    /**
     * main()方法執行，會首先加載Beetle類，先加載Insect類，父類靜態初始化，子類靜態初始化，然後父類非靜態初始化，子類非靜態初始化
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
