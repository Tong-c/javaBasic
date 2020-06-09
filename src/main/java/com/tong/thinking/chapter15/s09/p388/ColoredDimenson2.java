package com.tong.thinking.chapter15.s09.p388;

import com.tong.thinking.chapter15.s09.Dimenson;
import com.tong.thinking.chapter15.s09.HasColor;

public class ColoredDimenson2<T extends Dimenson & HasColor> extends Colored2<T>{

    ColoredDimenson2(T item) {
        super(item);
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}
