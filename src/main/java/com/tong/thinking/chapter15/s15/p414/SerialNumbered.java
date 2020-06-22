package com.tong.thinking.chapter15.s15.p414;

public class SerialNumbered extends Decorator {

    private static long counter = 1;

    private final long serialNumber = counter++;

    public SerialNumbered(Basic basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}
