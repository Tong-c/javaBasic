package com.tong.thinking.chapter15.s17.p424;

import java.util.Collection;

public class AddableCollectionAdapter<T> implements Addable<T> {

    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    @Override
    public void add(T t) {
        c.add(t);
    }
}
