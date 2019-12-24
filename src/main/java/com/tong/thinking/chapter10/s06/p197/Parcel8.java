package com.tong.thinking.chapter10.s06.p197;

/**
 * @author: Tong Chuang
 * @date: 2019/12/11
 */
public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
