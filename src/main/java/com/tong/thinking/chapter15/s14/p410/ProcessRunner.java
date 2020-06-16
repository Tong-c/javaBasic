package com.tong.thinking.chapter15.s14.p410;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T, E>> {

    List<T> processAll() throws E {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E> processor : this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}
