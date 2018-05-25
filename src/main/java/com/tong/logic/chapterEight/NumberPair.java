package com.tong.logic.chapterEight;

import com.sun.org.apache.regexp.internal.RE;

public class NumberPair<U extends Number,V extends Number> {

    private U first;
    private V second;

    public NumberPair(U first,V second){
        this.first = first;
        this.second = second;
    }

    public double sum(){
        return getFirst().doubleValue() + getSecond().doubleValue();
    }

    public U getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }
}
