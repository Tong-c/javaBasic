package com.tong.logic.chapterSeven;

import java.util.Random;

/**
 * 隨機密碼：複雜8位
 */
public class PassWordRndomTwo {

    private static final String SPECIAL_CHARS = "!@#$%^&*_=+/";


    private static int nextIndex(char[] chars,Random rnd){
        int index = rnd.nextInt(chars.length);
        while (chars[index] != 0){
            index = rnd.nextInt(chars.length);
        }
        return index;
    }

    private static char nextSpecialChar(Random rnd){
        return SPECIAL_CHARS.charAt(rnd.nextInt(SPECIAL_CHARS.length()));
    }

    private static char nextUpperLetter(Random rnd){
        return (char) ('A' + rnd.nextInt(26));
    }

    private static char nextLowerLetter(Random rnd){
        return (char) ('a' + rnd.nextInt(26));
    }

    private static char nextNumLetter(Random rnd ){
        return (char) ('0' + rnd.nextInt(10));
    }

    public static String randomPassword(){
        char[] chars = new char[8];
        Random rnd = new Random();
        chars[nextIndex(chars,rnd)] = nextSpecialChar(rnd);
        chars[nextIndex(chars,rnd)] = nextUpperLetter(rnd);
        chars[nextIndex(chars,rnd)] = nextLowerLetter(rnd);
        chars[nextIndex(chars,rnd)] = nextNumLetter(rnd);
        for(int i = 0;i < 8;i++){
            if(chars[i] == 0){
                chars[i] = PassWordRandom.nextChar(rnd);
            }
        }

        return new String(chars);
    }


}
