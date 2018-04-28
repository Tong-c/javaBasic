package com.tong.basic.generic;

import com.tong.basic.generic.Pair;

public class PairTest2 {

    public static void main(String[] args) {

    }
}



class ArrayAlgTwo{

    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null || a.length == 0) return  null;
        T min = a[0];
        T max = a[0];

        for(int i = 0 ;i<a.length;i++){
            if(min.compareTo(a[0]) > 0) min = a[i];
            if(max.compareTo(a[0]) < 0) max = a[i];
        }

        return new Pair<>(min,max);
    }
}
