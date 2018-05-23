package com.tong.logic.chapterSeven;

import java.util.Arrays;
import java.util.Random;

/**
 * 模擬洗牌
 */
public class ShffleTest {

    public static void main(String[] args) {
        int[] arr = new int[13];
        for(int i = 0;i < arr.length;i++){
            arr[i] = i;
        }
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void shuffle(int[] arr){
        Random rnd = new Random();
        for(int i = arr.length;i > 1;i--){
            swap(arr,i - 1,rnd.nextInt(i));
        }
    }
}
