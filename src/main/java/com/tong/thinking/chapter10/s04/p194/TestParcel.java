package com.tong.thinking.chapter10.s04.p194;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}
