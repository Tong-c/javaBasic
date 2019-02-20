package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust() ");
    }
}
