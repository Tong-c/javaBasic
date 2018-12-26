package com.tong.thinking.chapter07.s08.p140;

import java.util.Random;

public class FinalData {

    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;

    private final int i4 = rand.nextInt(20);//編譯時無法確認初值
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "14 = " + i4 + ", INT_5" + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;//引用類型，引用不變，指向的對象自身可以改變
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }

}
