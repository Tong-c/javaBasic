package com.tong.thinking.chapter10.s06.p198;

import com.tong.thinking.chapter10.s04.p194.Destination;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
public class Parcel9 {
    public Destination destination(String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
