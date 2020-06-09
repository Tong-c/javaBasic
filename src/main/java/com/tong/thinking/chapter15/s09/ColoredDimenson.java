package com.tong.thinking.chapter15.s09;

public class ColoredDimenson<T extends Dimenson & HasColor> {
    T item;

    ColoredDimenson(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
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
