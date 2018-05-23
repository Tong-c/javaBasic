package com.tong.logic.chapterSeven;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        randomSeed();
    }

    //Math.random()生成0-1之間的隨機數，包括0，不包括1
    public static void simpleMathRandom(){
        for(int i = 0;i < 3;i++){
            System.out.println(Math.random());
        }
    }


    public static void simpleRandom(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt());//生成隨機int
        System.out.println(rnd.nextInt(100));//生成0-100之間的Int,包括0，不包括100
    }


    //實現可重複的隨機
    public static void randomSeed(){
        Random rnd = new Random(20160824);
        for(int i = 0;i < 5;i++){
            System.out.println(rnd.nextInt(100) + " ");
        }
    }







}
