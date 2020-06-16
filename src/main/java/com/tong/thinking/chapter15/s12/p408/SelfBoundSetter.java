package com.tong.thinking.chapter15.s12.p408;

public interface SelfBoundSetter<T extends SelfBoundSetter<T>> {

    void set(T arg);
}
