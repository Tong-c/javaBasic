package com.tong.thinking.chapter15.s09.p388;

public class HoldItem<T> {
    T item;

    HoldItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }


}
