package com.tong.thinking.chapter15.s14.p410;

import java.util.List;

public interface Processor<T, E extends Exception> {
    void process(List<T> resultCollector) throws E;
}
