package com.tong.thinking.chapter15.s08.p383;

abstract class GenericWithCreate<T> {

    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}
