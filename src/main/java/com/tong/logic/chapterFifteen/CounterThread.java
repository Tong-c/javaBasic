package com.tong.logic.chapterFifteen;

/**
 * @Description: 競態條件示例
 * @Author: 仝闖
 * @Create: 2018/7/26 0026 下午 6:19
 */
public class CounterThread extends Thread {

    private static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter);

    }
}
