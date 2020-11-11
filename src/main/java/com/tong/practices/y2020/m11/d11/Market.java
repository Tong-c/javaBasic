package com.tong.practices.y2020.m11.d11;

public class Market {

    public synchronized void sell() throws InterruptedException {
        System.out.println("卖光了");
//        Thread.sleep(1);
        notifyAll();
    }


    public synchronized void stock() throws InterruptedException {
        System.out.println("进货");
        Thread.sleep(3);
        notifyAll();
    }


    public synchronized void waitSell() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public synchronized void waitStock() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
