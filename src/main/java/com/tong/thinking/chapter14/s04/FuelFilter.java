package com.tong.thinking.chapter14.s04;

public class FuelFilter extends Filter {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }

}
