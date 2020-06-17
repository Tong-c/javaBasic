package com.tong.thinking.chapter15.s17.p421;

import java.util.ArrayList;

public class FilledList<T> extends ArrayList<T> {

    public FilledList(Class<? extends T> type, int size) {
        for (int i = 0; i < size; i++) {
            try {
                add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
