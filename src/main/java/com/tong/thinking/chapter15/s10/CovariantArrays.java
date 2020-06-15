package com.tong.thinking.chapter15.s10;


public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        fruits[0] = new Fruit();
        fruits[0] = new Orange();
    }
}
