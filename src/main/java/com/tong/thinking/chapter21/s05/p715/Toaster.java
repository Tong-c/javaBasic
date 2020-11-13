package com.tong.thinking.chapter21.s05.p715;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Toaster implements Runnable {

    private ToastQueue toastQueue;
    private int count = 0;
    private Random rand = new Random(47);

    public Toaster(ToastQueue tq) {
        toastQueue = tq;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                TimeUnit.MILLISECONDS.sleep(100 + rand.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Toast t = new Toast(count++);
            System.out.println(t);
            try {
                toastQueue.put(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Toast off");
        }
    }
}
