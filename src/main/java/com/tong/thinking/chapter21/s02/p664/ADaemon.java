package com.tong.thinking.chapter21.s02.p664;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting ADaemon");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This should always run ?");
        }
    }
}
