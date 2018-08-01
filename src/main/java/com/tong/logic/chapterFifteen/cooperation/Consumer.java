package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 一個簡單的消費者
 * @Author: 仝闖
 * @Create: 2018/8/1 0001 下午 5:35
 */
public class Consumer extends Thread {

    MyBlockingQueue<String> queue;

    public Consumer(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String task = queue.take();
                System.out.println("handle task " + task);
                Thread.sleep((int) Math.random() * 100);
            }
        } catch (InterruptedException e) {

        }
    }
}
