package com.tong.logic.chapterFifteen;

/**
 * @Description: 內存可見性示例
 * @Author: 仝闖
 * @Create: 2018/7/26 0026 下午 6:24
 */
public class VisibilityDemo {

    private static boolean shutdown = false;

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!shutdown) {

            }
            System.out.println("exit hello");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        new HelloThread().start();
        Thread.sleep(1000);
        shutdown = true;
        System.out.println("exit main");
    }
}
