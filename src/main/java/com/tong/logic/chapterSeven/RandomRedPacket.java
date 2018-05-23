package com.tong.logic.chapterSeven;

import java.util.Random;

/**
 * 搶紅包
 */
public class RandomRedPacket {

    private int leftMoney;
    private int leftNum;
    private Random rnd;

    public RandomRedPacket(int total,int num){
        this.leftMoney = total;
        this.leftNum = num;
        this.rnd = new Random();
    }

    public synchronized int nextMoney(){

        if(this.leftNum <= 0){
            throw new IllegalStateException("搶光了");
        }

        if(this.leftNum == 1){
            return this.leftMoney;
        }

        double max = this.leftMoney/this.leftNum * 2d;
        int money = (int) (rnd.nextDouble() * max);
        money = Math.max(1,money);
        this.leftMoney -= money;
        this.leftNum --;
        return money;
    }
}
