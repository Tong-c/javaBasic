package com.tong.logic.chapterOne;

public class One {

    public static void main(String[] args) {
        oper();
    }


    //數組的三种初始化
    public void initArray() {
        int[] a = {1, 2, 3, 34};
        int[] b = new int[4];
        int[] c = new int[]{1, 2, 3, 4};
    }


    //運算符的注意事項
    public static void oper() {

        //數據範圍
        int a = 2147483647 * 2; //輸出-2
        System.out.println(a);
        long b = 2147483647 * 2L; //正確處理
        System.out.println(b);

        //整數相除
        double d = 10 / 4;
        System.out.println(d); //輸出2.0,捨去小數位

        double e = 10 / 4.0;
        System.out.println(e); //輸出2.5

        double f = 10 / (double) 4;
        System.out.println(f); //輸出2.5

        //小數計算不明確
        float g = 0.1f * 0.1f;
        System.out.println(g); //輸出0.010000001

        double h = 0.1 * 0.1;
        System.out.println(h); //輸出0.010000000000000002

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(a1 == a2); //輸出false，比較引用


    }


}
