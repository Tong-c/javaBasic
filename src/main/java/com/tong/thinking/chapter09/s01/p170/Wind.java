package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}
