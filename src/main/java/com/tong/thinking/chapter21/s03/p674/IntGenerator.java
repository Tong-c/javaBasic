package com.tong.thinking.chapter21.s03.p674;

public abstract class IntGenerator {
    private volatile boolean cancled = false;

    public abstract int next();

    public void cancel() {
        cancled = true;
    }

    public boolean isCancled() {
        return cancled;
    }
}
