package com.tong.thinking.chapter15.s04.p364;

import net.mindview.util.Generator;

/**
 * @author: Tong Chuang
 * @date: 2020/5/19
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

}
