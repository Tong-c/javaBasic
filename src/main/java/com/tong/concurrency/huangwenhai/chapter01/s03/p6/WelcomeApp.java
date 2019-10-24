package com.tong.concurrency.huangwenhai.chapter01.s03.p6;

/**
 * 以定义 Thread 类子类的方式创建线程
 */
public class WelcomeApp {

    public static void main(String[] args) {

        Thread welcomeThread = new WelcomeThread();

        welcomeThread.start();

        System.out.printf("1.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}
