package com.tong.logic.chapterEleven;

import java.util.Collection;
import java.util.PriorityQueue;

public class TopK<E> {

    private PriorityQueue<E> p;
    private int k;

    public TopK(int k) {
        this.k = k;
        this.p = new PriorityQueue<>(k);
    }

    public void addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
    }

    public void add(E e) {
        if (p.size() < k) {
            p.add(e);
            return;
        }

        Comparable<? super E> head = (Comparable<? super E>) p.peek();
        if (head.compareTo(e) > 0) {
            return;
        }
        p.poll();
        p.add(e);
    }


    public <T> T[] toArray(T[] a) {
        return p.toArray(a);
    }

    public E getKth() {
        return p.peek();
    }
}
