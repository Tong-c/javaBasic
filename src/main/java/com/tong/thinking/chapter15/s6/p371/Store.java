package com.tong.thinking.chapter15.s6.p371;

import java.util.ArrayList;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a : this) {
            for (Shelf s : a) {
                for (Product p : s) {
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
