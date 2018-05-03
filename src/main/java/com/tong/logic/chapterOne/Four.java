package com.tong.logic.chapterOne;


public class Four {


    public static void main(String[] args) {
        int[] arr = {19,20,30,40};
        reset(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }




    //經典問題，值傳遞或者引用傳遞
    public static void reset(int[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = i;
        }
    }


    //可變參數
    public static int max(int min,int... a){
        int max = min;
        for(int i = 0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        return max;
    }


    //遞歸
    public static long factorial(int n){
        if(n == 0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }


    //遞歸轉為非遞歸
    public static long factorialNon(int n){
        long result = 1;
        for(int i = 1;i<n;i++){
            result = result * i;
        }
        return result;
    }






}
