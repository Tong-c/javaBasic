package com.tong.logic.chapterFifteen.cooperation;


public class ProducerConsumerApp {

    public static void main(String[] args) {
        MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);
        new Producer(queue).start();
        new Consumer(queue).start();

    }
}
