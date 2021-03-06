package com.tong.thinking.chapter09.s02.p173;

import com.tong.thinking.chapter08.s01.p148.Note;


public class Stringed implements Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "stringed";
    }
}
