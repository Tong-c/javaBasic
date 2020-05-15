package com.tong.thinking.chapter14.s04;

public class GeneratorBelt extends Belt {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
