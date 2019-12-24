package com.tong.thinking.chapter09.s03;

import java.util.Arrays;

public class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
