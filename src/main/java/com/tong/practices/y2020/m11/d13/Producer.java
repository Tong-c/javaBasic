package com.tong.practices.y2020.m11.d13;

public class Producer implements Runnable {

    private Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {
            synchronized (this) {
                while (market.goods != null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("生产了");
            synchronized (market.consumer) {
                market.goods = new Goods();
                market.consumer.notifyAll();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
