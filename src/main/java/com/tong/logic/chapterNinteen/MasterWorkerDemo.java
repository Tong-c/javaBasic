package com.tong.logic.chapterNinteen;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: 使用CountDownLatch實現主從協作場景
 * @Author: 仝闖
 * @Create: 2018/8/8 0008 下午 5:54
 */
public class MasterWorkerDemo {

    static class Worker extends Thread {
        CountDownLatch latch;

        public Worker(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((int) (Math.random() * 1000));
                if (Math.random() < 0.02) {
                    throw new RuntimeException("bad luck");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                this.latch.countDown();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int workerNum = 100;
        CountDownLatch latch = new CountDownLatch(workerNum);
        Worker[] workers = new Worker[workerNum];
        for (int i = 0; i < workerNum; i++) {
            workers[i] = new Worker(latch);
            workers[i].start();
        }
        latch.await();
        System.out.println("collect worker results");
    }
}
