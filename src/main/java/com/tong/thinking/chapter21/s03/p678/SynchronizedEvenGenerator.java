package com.tong.thinking.chapter21.s03.p678;

import com.tong.thinking.chapter21.s03.p674.IntGenerator;
import com.tong.thinking.chapter21.s03.p675.EvenChecker;

public class SynchronizedEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
