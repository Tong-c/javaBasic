package com.tong.thinking.chapter21.s02.p655;

import com.tong.thinking.chapter21.s02.p654.LiftOff;

public class BasicThread {

    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
