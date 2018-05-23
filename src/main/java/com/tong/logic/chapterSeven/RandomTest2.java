package com.tong.logic.chapterSeven;

import java.util.Random;

public class RandomTest2 {

    public static void main(String[] args) {
        System.out.println(randomPassword());
    }

    public static String randomPassword(){
        char[] chars = new char[6];
        Random rnd = new Random();
        for(int i = 0;i < 6;i++){
            int random = rnd.nextInt(10);
            int j = '0' + random;
            chars[i] = (char) ('0' + random);
        }
        return new String(chars);
    }


}
