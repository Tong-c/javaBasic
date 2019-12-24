package com.tong.thinking.chapter09.s02.p173;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Music5 {

    static void tune(Instrument instrument) {
        instrument.play(Note.NIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }

}
