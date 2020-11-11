package com.tong.practices.y2020.m11.d11;

public class Seller implements Runnable {

    private Market market;

    public Seller(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        while (true) {
            market.waitSell();
            try {
                market.sell();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
