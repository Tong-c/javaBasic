package com.tong.logic.chapterFifteen;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread name:" + Thread.currentThread().getName());
        System.out.println("hello");
    }
}
