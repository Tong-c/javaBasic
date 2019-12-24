package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 等待結束-使用MyLatch的工作子綫程
 * @Author: 仝闖
 * @Create: 2018/8/1 0001 下午 5:55
 */
public class Worker extends Thread {
    MyLatch latch;

    public Worker(MyLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            this.latch.countDown();
        } catch (InterruptedException e) {
        }
    }
}
