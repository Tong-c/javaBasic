package com.tong.thinking.chapter15.s15.p413;

public class SerialNumberedImp implements SerialNumbered {

    private static long counter = 1;

    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}
