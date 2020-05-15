package com.tong.thinking.chapter14.s04;

public class FanBelt extends Belt {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
