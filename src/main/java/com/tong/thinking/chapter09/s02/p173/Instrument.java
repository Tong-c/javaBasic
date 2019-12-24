package com.tong.thinking.chapter09.s02.p173;

import com.tong.thinking.chapter08.s01.p148.Note;

public interface Instrument {
    int VALUE = 3;

    void play(Note note);

    void adjust();
}
