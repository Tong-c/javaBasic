package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 簡單協作示例
 * @Author: 仝闖
 * @Create: 2018/7/31 0031 下午 6:01
 */
public class WaitThread extends Thread {

    private volatile boolean fire = false;

    @Override
    public void run() {
        try {
            synchronized (this) {
                while (!fire) {
                    wait();
                }
            }
            System.out.println("fired");
        } catch (InterruptedException e) {
        }
    }

    public synchronized void fire() {
        this.fire = true;
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();
    }
}
