package com.tong.thinking.chapter21.s03.p690;

public class SyncObject {

    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();

        new Thread() {
            @Override
            public void run() {
                ds.f();
            }
        }.start();

        ds.g();
    }
}
