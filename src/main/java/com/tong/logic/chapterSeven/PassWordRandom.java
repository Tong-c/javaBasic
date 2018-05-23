package com.tong.logic.chapterSeven;

import java.util.Random;

/**
 * 隨機密碼：簡單8位
 */
public class PassWordRandom {

    private static final String SPECIAL_CHARS = "!@#$%^&*_=+/";

    public static char nextChar(Random rnd){
        switch (rnd.nextInt(4)){
            case 0:
                return (char) ('a' + rnd.nextInt(26 ));
            case 1:
                return (char) ('A' + rnd.nextInt(26));
            case 2:
                return (char) ('0' + rnd.nextInt(10));
            default:
                return SPECIAL_CHARS.charAt(rnd.nextInt(SPECIAL_CHARS.length()));
        }
    }


    public static String randomPassword(){
        char[] chars = new char[8];
        Random rnd = new Random();
        for(int i = 0;i < 8;i++){
            chars[i] = nextChar(rnd);
        }
        return new String(chars);
    }
}
