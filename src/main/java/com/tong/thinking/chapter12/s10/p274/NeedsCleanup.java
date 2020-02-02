package com.tong.thinking.chapter12.s10.p274;

public class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup" + id + " disposed");
    }
}
