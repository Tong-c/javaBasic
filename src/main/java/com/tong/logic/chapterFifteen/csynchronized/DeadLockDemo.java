package com.tong.logic.chapterFifteen.csynchronized;

/**
 * @Description: 死鎖示例
 * @Author: 仝闖
 * @Create: 2018/7/31 0031 下午 5:28
 */
public class DeadLockDemo {

    private static Object lockA = new Object();
    private static Object lockB = new Object();

    private static void startThreadA() {
        Thread aThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockA) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (lockB) {

                }
            }
        };

        aThread.start();
    }


    private static void startThreadB() {
        Thread bThread = new Thread() {
            @Override
            public void run() {
                synchronized (lockB) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (lockA) {

                }
            }
        };

        bThread.start();

    }

    public static void main(String[] args) {
        startThreadA();
        startThreadB();
    }
}
