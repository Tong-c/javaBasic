package com.tong.thinking.chapter15.s15.p413;

import java.util.Date;

public class TimeStampedImp implements TimeStamped {

    private final long timestamp;

    public TimeStampedImp() {
        timestamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timestamp;
    }
}
