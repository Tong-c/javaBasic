package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.NIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind()};
        tuneAll(orchestra);
    }
}
