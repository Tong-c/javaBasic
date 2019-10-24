package com.tong.concurrency.huangwenhai.chapter01.s03.p7;

/**
 * @author: Tong Chuang
 * @date: 2019/10/23
 */
public class WelcomeTask implements Runnable {

    @Override
    public void run() {
        System.out.printf("2.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}
