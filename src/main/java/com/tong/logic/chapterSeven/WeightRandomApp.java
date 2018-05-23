package com.tong.logic.chapterSeven;

public class WeightRandomApp {

    public static void main(String[] args) {
        Pair[] options = new Pair[]{new Pair("1元",7),new Pair("5元",2),new Pair("10元",1)};
        WeightRandom rnd = new WeightRandom(options);
        for(int i = 0;i < 10;i++){
            System.out.println(rnd.nextItem() + " ");
        }
    }
}
