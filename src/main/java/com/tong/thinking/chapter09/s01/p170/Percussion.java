package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}
