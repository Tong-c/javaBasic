package com.tong.concurrency.chapter01;

public class DeadLockTest {
    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get ResourceA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceB");
                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get ResourceB");
                    }
                }
            }
        });


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceB) {
                    System.out.println(Thread.currentThread() + " get ResourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceA");
                    synchronized (resourceA) {
                        System.out.println(Thread.currentThread() + " get ResourceA");
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }

}
