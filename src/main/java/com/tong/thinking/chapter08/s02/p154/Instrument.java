package com.tong.thinking.chapter08.s02.p154;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }

}
