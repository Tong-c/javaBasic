package com.tong.logic.chapterFifteen;

public class ThreadTestOne {

    public static void main(String[] args) throws InterruptedException {
        HelloThread helloThread = new HelloThread();
        helloThread.start();
        helloThread.run();
        helloThread.join();
    }

}
