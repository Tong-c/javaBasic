package com.tong.thinking.chapter08.s02.p154;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
