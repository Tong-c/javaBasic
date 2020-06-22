package com.tong.thinking.chapter15.s17.p421;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apply {

    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        for (T t : seq) {
            try {
                f.invoke(t, args);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
