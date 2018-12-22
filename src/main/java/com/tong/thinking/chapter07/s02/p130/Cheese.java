package com.tong.thinking.chapter07.s02.p130;

public class Cheese extends BoardGame {

    Cheese() {
        super(11);
        System.out.println("Cheese constructor");
    }

    public static void main(String[] args) {
        Cheese x = new Cheese();
    }
}
