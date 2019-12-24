package com.tong.thinking.chapter09.s03;

public class Upcase extends Processor {

    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
