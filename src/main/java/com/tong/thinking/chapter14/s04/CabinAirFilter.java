package com.tong.thinking.chapter14.s04;

public class CabinAirFilter extends Filter {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
