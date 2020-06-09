package com.tong.thinking.chapter15.s09.p388;

import com.tong.thinking.chapter15.s09.Dimenson;
import com.tong.thinking.chapter15.s09.HasColor;
import com.tong.thinking.chapter15.s09.Weight;

public class Solid2<T extends Dimenson & HasColor & Weight> extends ColoredDimenson2<T> {

    Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}
