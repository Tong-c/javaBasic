package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();

}
