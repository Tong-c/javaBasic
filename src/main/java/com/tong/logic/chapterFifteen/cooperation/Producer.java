package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 一個簡單的生產者
 * @Author: 仝闖
 * @Create: 2018/8/1 0001 下午 5:33
 */
public class Producer extends Thread {

    MyBlockingQueue<String> queue;

    public Producer(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int num = 0;
        try {
            while (true) {
                String task = String.valueOf(num);
                queue.put(task);
                System.out.println("produce task" + task);
                num++;
                Thread.sleep((int) (Math.random() * 100));
            }
        } catch (InterruptedException e) {

        }
    }
}
