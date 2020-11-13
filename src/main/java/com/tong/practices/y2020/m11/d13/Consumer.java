package com.tong.practices.y2020.m11.d13;

public class Consumer implements Runnable {

    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {
            synchronized (this) {
                while (market.goods == null) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("消费了");
            synchronized (market.producer) {
                market.goods = null;
                /*market.producer.*/notifyAll();
            }
        }
    }
}
