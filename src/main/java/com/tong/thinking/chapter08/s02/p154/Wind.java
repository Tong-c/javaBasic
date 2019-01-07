package com.tong.thinking.chapter08.s02.p154;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
