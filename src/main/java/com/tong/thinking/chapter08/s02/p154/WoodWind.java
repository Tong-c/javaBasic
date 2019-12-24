package com.tong.thinking.chapter08.s02.p154;

import com.tong.thinking.chapter08.s01.p148.Note;

public class WoodWind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }
}
