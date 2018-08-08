package com.tong.logic.chapterNinteen;

import java.util.concurrent.CountDownLatch;

/**
   * @Description:    使用CountDownLatch實現同時開始場景
   * @Author:     仝闖
   * @Create:     2018/8/8 0008 下午 5:49
   */
public class RacerWithCountDownLatch {

    static class Racer extends Thread{
        CountDownLatch latch;
        public Racer(CountDownLatch latch){
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                this.latch.await();
                System.out.println(getName() + " start run " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        CountDownLatch latch = new CountDownLatch(1);
        Thread[] racers = new Thread[num];
        for(int i = 0;i < racers.length;i++){
            racers[i] = new Racer(latch);
            racers[i].start();
        }
        Thread.sleep(1000);
        latch.countDown();
    }
}
