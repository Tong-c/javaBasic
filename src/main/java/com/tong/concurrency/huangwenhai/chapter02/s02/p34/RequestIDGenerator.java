package com.tong.concurrency.huangwenhai.chapter02.s02.p34;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Tong Chuang
 * @date: 2019/10/25
 */
public final class RequestIDGenerator implements CircularSeqGenerator {

    private final static RequestIDGenerator INSTANCE = new RequestIDGenerator();
    private final static short SEQ_UPPER_LIMIT = 999;
    private short sequence = -1;

    private RequestIDGenerator() {

    }


    @Override
    public short nextSequence() {
        if (sequence >= SEQ_UPPER_LIMIT) {
            sequence = 0;
        } else {
            sequence++;
        }
        return sequence;
    }

    public String nextID() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String timestamp = sdf.format(new Date());
        DecimalFormat df = new DecimalFormat("000");

        short sequenceNo = nextSequence();
        return "0049" + timestamp + df.format(sequenceNo);
    }

    public static RequestIDGenerator getInstance() {
        return INSTANCE;
    }
}
