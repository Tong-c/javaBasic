package com.tong.thinking.chapter15.s09.p388;

import com.tong.thinking.chapter15.s09.HasColor;

public class Colored2<T extends HasColor> extends HoldItem<T> {

    Colored2(T item) {
        super(item);
    }

    java.awt.Color color() {
        return item.getColor();
    }
}
