package com.tong.thinking.chapter14.s04;

import java.util.ArrayList;
import java.util.List;

public class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {

    }
}
