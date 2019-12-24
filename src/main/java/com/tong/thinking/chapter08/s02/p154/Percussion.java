package com.tong.thinking.chapter08.s02.p154;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
