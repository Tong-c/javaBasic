package com.tong.thinking.chapter14.s02.p322;

import com.tong.thinking.chapter14.s02.p316.FancyToy;

/**
 * @author: Tong Chuang
 * @date: 2020/3/16
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> fcClass = FancyToy.class;
        FancyToy fancyToy = fcClass.newInstance();
        Class<? super FancyToy> up = fcClass.getSuperclass();
        Object object = up.newInstance();
    }
}
