package com.tong.thinking.chapter14.s04;

public class AirFilter extends Filter {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
