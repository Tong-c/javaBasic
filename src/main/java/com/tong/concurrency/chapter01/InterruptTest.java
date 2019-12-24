package com.tong.concurrency.chapter01;


public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {

                }
            }
        });

        threadOne.start();

        threadOne.interrupt();

        System.out.println("isInterrupted: " + threadOne.isInterrupted());//threadOne 被中断，所以返回 true

        System.out.println("isInterrupted: " + threadOne.interrupted()); //主线程并未被中断，所以返回 false, interrupted 方法，返回的是当前线程的中断状态

        System.out.println("isInterrupted: " + Thread.interrupted()); //主线程并未被中断，所以返回 false

        System.out.println("isInterrupted: " + threadOne.isInterrupted()); //threadOne 被中断，所以返回 true

        threadOne.join();

        System.out.println("main thread is over");
    }
}
