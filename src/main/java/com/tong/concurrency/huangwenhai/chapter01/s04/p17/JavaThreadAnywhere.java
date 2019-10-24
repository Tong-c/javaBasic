package com.tong.concurrency.huangwenhai.chapter01.s04.p17;

/**
 * @author: Tong Chuang
 * @date: 2019/10/24
 */
public class JavaThreadAnywhere {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();

        String currentThreadName = currentThread.getName();

        System.out.printf("The main method was executed by thread:%s", currentThreadName);

        Helper helper = new Helper("Java Thread Anywhere");
        helper.run();
    }

    static class Helper implements Runnable {

        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        private void doSomething(String message) {
            Thread currentThread = Thread.currentThread();

            String currentThreadName = currentThread.getName();

            System.out.printf("The doSomething method was executed by thread:%s", currentThreadName);
        }

        @Override
        public void run() {
            doSomething(message);
        }
    }
}
