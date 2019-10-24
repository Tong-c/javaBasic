package com.tong.concurrency.huangwenhai.chapter01.s03.p6;

/**
 * @author: Tong Chuang
 * @date: 2019/10/23
 */
public class WelcomeThread extends Thread {

    @Override
    public void run() {
        System.out.printf("2.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}
