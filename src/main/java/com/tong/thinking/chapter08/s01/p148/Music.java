package com.tong.thinking.chapter08.s01.p148;

public class Music {
    //方法接受一個Instrument引用，同時也接受任何導出自Instrument的類
    public static void tune(Instrument i) {
        i.play(Note.NIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flutte = new Wind();
        tune(flutte);
    }
}
