package com.tong.concurrency.huangwenhai.chapter01.s03.p7;

/**
 * 以创建 Runnable 实例的方式创建线程
 */
public class WelcomeApp1 {

    public static void main(String[] args) {

        Thread welcomeThread = new Thread(new WelcomeTask());

        welcomeThread.start();

        System.out.printf("1.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}
