package com.tong.logic.chapterEight;

public class PairTwo<U, V> {

    U first;
    V second;

    public PairTwo(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
