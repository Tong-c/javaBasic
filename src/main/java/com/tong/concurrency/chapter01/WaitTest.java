package com.tong.concurrency.chapter01;

/**
 * @Description: 当线程调用共享变量的wait()方法后，只会释放当前共享变量上的锁
 * @Author: 1972376180@qq.com
 * @Date: 2019/7/16 9:45
 */
public class WaitTest {
    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (resourceA) {
                        System.out.println("threadA get resourceA lock");
                        synchronized (resourceB) {
                            System.out.println("threadA get resourceB lock");
                            System.out.println("threadA release resourceA lock");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread threadB = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    synchronized (resourceA) {
                        System.out.println("threadB get resourceA lock");
                        System.out.println("threadB try get resourceB lock");
                        synchronized (resourceB) {
                            System.out.println("threadB release resourceA lock");
                            resourceB.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("main over");
    }
}
