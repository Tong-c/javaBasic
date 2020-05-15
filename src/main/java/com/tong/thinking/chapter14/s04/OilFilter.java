package com.tong.thinking.chapter14.s04;

public class OilFilter extends Filter {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
