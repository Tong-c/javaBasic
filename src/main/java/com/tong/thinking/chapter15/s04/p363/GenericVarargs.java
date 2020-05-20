package com.tong.thinking.chapter15.s04.p363;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tong Chuang
 * @date: 2020/5/19
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }
}
