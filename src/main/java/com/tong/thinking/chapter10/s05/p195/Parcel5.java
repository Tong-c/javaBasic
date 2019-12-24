package com.tong.thinking.chapter10.s05.p195;

import com.tong.thinking.chapter10.s04.p194.Destination;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
public class Parcel5 {

    public Destination destination(String s) {
        class PDestionation implements Destination {

            private String label;

            private PDestionation(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestionation(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
