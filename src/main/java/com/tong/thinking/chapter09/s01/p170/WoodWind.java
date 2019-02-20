package com.tong.thinking.chapter09.s01.p170;

import com.tong.thinking.chapter08.s01.p148.Note;

public class WoodWind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }
}
