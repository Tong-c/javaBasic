package com.tong.thinking.chapter08.s01.p148;

public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.NIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.NIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.NIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);

    }
}
