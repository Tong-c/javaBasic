package com.tong.logic.chapterFifteen.cooperation;

public class MyLatchApp {
    public static void main(String[] args) throws InterruptedException {
        int workerNum = 10;
        MyLatch latch = new MyLatch(workerNum);
        Worker[] workers = new Worker[workerNum];
        for(int i = 0; i < workerNum; i++){
            workers[i] = new Worker(latch);
            workers[i].start();
        }
        latch.await();
        System.out.println("collect worker results");
    }

}
