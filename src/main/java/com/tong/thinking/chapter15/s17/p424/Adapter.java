package com.tong.thinking.chapter15.s17.p424;

import java.util.Collection;

public class Adapter {

    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<>(c);
    }
}
