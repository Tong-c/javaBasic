package com.tong.concurrency.huangwenhai.chapter01.s03.p16;

/**
 * 利用 <code>Thread.sleep()</code>实现简易的倒计时
 */
public class SimpleTimer {
    private static int count;

    public static void main(String[] args) {
        count = args.length >= 1 ? Integer.valueOf(args[0]) : 60;
        int remaining;
        while (true) {
            remaining = countDown();
            if (0 == remaining) {
                break;
            } else {
                System.out.println("Remaining " + count + " second(s)");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Done.");
    }

    private static int countDown() {
        return count--;
    }
}
