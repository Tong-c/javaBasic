package com.tong.practices.y2020.m11.d11;

public class Stocker implements Runnable {

    private Market market;

    public Stocker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        while (true) {
            try {
                market.stock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            market.waitStock();
        }
    }
}
