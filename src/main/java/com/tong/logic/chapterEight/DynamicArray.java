package com.tong.logic.chapterEight;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elmentData;

    public DynamicArray() {
        this.elmentData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elmentData.length;
        if (oldCapacity > minCapacity) {
            return;
        }

        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elmentData = Arrays.copyOf(elmentData, newCapacity);
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elmentData[size++] = e;
    }

    public E get(int index) {
        return (E) elmentData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elmentData[index] = element;
        return oldValue;
    }


    public <T extends E> void addAll(DynamicArray<T> c) {
        for (int i = 0; i < size; i++) {
            add(c.get(i));
        }
    }

    public void copyTo(DynamicArray<? super E> desc) {
        for (int i = 0; i < size; i++) {
            desc.add(get(i));
        }
    }


}
