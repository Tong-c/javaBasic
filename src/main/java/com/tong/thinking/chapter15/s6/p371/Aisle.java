package com.tong.thinking.chapter15.s6.p371;

import java.util.ArrayList;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Aisle extends ArrayList<Shelf> {

    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}
