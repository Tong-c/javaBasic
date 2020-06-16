package com.tong.thinking.chapter15.s12.p408;

public interface GenericGetter<T extends GenericGetter<T>> {

    T get();
}
