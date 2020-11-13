package com.tong.practices.y2020.m11.d13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Market {

    public Goods goods = null;
    public Producer producer;
    public Consumer consumer;

    public Market() {
        this.producer = new Producer(this);
        this.consumer = new Consumer(this);
    }

    public static void main(String[] args) {
        Market market = new Market();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(market.consumer);
        exec.execute(market.producer);
    }
}
