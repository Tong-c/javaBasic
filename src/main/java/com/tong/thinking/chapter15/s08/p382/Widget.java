package com.tong.thinking.chapter15.s08.p382;

public class Widget {
    public static class Factory implements FactoryI<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
