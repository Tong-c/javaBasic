package com.tong.thinking.chapter21.s9.p748;

public class SynchronizingTest extends Incrementable {
    @Override
    public synchronized void increment() {
        ++counter;
    }
}
