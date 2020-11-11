package com.tong.thinking.chapter21.s03.p700;

public class Blocked2 implements Runnable {

    BlockedMutex blocked = new BlockedMutex();

    @Override
    public void run() {
        System.out.println("Waiting for f() in BlockedMutex");
        blocked.f();
        System.out.println("Broken out of blocked call");
    }
}
