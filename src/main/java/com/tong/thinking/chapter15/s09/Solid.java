package com.tong.thinking.chapter15.s09;

public class Solid<T extends Dimenson & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
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

    int weight() {
        return item.weight();
    }
}
