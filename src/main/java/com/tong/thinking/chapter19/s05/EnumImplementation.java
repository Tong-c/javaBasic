package com.tong.thinking.chapter19.s05;


public class EnumImplementation {
    public static <T> void printNext() {

    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext();
        }
    }

}
