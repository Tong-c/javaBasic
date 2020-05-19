package com.tong.thinking.chapter14.s02.p322;

/**
 * @author: Tong Chuang
 * @date: 2020/3/18
 */
public class CalssCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b;
    }
}
