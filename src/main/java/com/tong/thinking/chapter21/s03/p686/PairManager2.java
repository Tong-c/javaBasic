package com.tong.thinking.chapter21.s03.p686;

public class PairManager2 extends PairManager {

    @Override
    public void increment() {
        Pair temp;

        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }

        store(temp);
    }
}
