package com.tong.logic.chapterFifteen;

public class ThreadTestTwo {

    public static void main(String[] args) {
        Thread helloThread = new Thread(new HelloRunnable());
        helloThread.start();
    }
}
