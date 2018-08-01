package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 同時開始-協作對象FireFlag
 * @Author: 仝闖
 * @Create: 2018/8/1 0001 下午 5:41
 */
public class FireFlag {

    private volatile boolean fired = false;

    public synchronized void waitForFire() throws InterruptedException {
        while (!fired) {
            wait();
        }
    }

    public synchronized void fire() {
        this.fired = true;
        notifyAll();
    }
}
