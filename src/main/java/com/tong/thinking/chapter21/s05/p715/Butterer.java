package com.tong.thinking.chapter21.s05.p715;

public class Butterer implements Runnable {

    private ToastQueue dryQueue, butteredQueue;

    public Butterer(ToastQueue dry, ToastQueue buttered) {
        dryQueue = dry;
        butteredQueue = buttered;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueue.take();
                t.buffer();
                System.out.println(t);
                butteredQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Butterer interrupted");
        }
        System.out.println("Butterer off");
    }
}
