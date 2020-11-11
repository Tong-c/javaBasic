package com.tong.practices.y2020.m11.d11;

public class MarketTest {

    public static void main(String[] args) {
        Market market = new Market();
        new Thread(new Seller(market)).start();
        new Thread(new Stocker(market)).start();
    }
}
