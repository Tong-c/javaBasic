package com.tong.thinking.chapter15.s08.p381;

public class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) throws IllegalAccessException, InstantiationException {
        x = kind.newInstance();
    }

}
