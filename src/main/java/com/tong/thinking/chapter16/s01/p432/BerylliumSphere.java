package com.tong.thinking.chapter16.s01.p432;

public class BerylliumSphere {

    private static long counter;

    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}
