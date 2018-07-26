package com.tong.logic.chapterEleven;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Median<E> {
    private PriorityQueue<E> minP;
    private PriorityQueue<E> maxP;
    private E m;
    public Median(){
        this.minP = new PriorityQueue<>();
        this.maxP = new PriorityQueue<>(11,Collections.<E>reverseOrder());
    }

    public int compare(E e,E m){
        Comparable<? super E> cmpr = (Comparable<? super E>) e;
        return cmpr.compareTo(m);
    }

    public void add(E e){
        if (m == null){
            m = e;
            return;
        }

        if(compare(e,m) <= 0){
            maxP.add(e);
        }else {
            minP.add(e);
        }

        if(minP.size() - maxP.size() >= 2){
            maxP.add(this.m);
            this.m = minP.poll();
        }else if(maxP.size() - minP.size() >= 2){
            minP.add(this.m);
            this.m = maxP.poll();
        }
    }

    public void addAll(Collection<? extends E> c){
        for (E e:c){
            add(e);
        }
    }

    public E getM(){
        return m;
    }


}
