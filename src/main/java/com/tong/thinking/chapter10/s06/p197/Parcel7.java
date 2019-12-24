package com.tong.thinking.chapter10.s06.p197;

import com.tong.thinking.chapter10.s04.p194.Contents;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
public class Parcel7 {

    public Contents contents() {
        return new Contents() {

            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
