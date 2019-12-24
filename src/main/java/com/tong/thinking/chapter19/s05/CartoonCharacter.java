package com.tong.thinking.chapter19.s05;


import java.util.Random;

public enum CartoonCharacter  {
    SLAPPT, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);

    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
