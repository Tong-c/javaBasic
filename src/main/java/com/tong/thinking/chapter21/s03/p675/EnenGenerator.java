package com.tong.thinking.chapter21.s03.p675;

import com.tong.thinking.chapter21.s03.p674.IntGenerator;

public class EnenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EnenGenerator());
    }
}
