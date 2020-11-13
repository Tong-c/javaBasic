package com.tong.thinking.chapter21.s05.p707;

public class Task implements Runnable {

    static Blocker blocker = new Blocker();

    @Override
    public void run() {
        blocker.waitingCall();
    }
}
