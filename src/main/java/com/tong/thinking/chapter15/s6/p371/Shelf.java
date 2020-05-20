package com.tong.thinking.chapter15.s6.p371;

import com.tong.thinking.chapter15.s04.p364.Generators;

import java.util.ArrayList;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Shelf extends ArrayList<Product> {

    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }

}
