package com.tong.logic.chapterNinteen;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Description: CyclicBarrier示例
 * @Author: 仝闖
 * @Create: 2018/8/9 0009 下午 5:39
 */
public class CyclicBarrierDemo {
    static class Tourist extends Thread {
        CyclicBarrier barrier;

        public Tourist(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((long) (Math.random() * 1000));
                barrier.await();
                System.out.println(this.getName() + " arrived A " + System.currentTimeMillis());
                Thread.sleep((long) (Math.random() * 1000));
                barrier.await();
                System.out.println(this.getName() + " arrived B " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int num = 3;
        Tourist[] threads = new Tourist[num];
        CyclicBarrier barrier = new CyclicBarrier(num, new Runnable() {
            @Override
            public void run() {
                System.out.println(" all arrived " + System.currentTimeMillis() + " executed by " + Thread.currentThread().getName());
            }
        });
        for(int i = 0 ;i < num ; i++){
            threads[i] = new Tourist(barrier);
            threads[i].start();
        }

    }

}
