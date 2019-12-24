package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 協作對象AssemblePoint
 * @Author: 仝闖
 * @Create: 2018/8/2 0002 下午 5:43
 */
public class AssemblePoint {

    private int n;

    public AssemblePoint(int n) {
        this.n = n;
    }

    public synchronized void await() throws InterruptedException {
        if (n > 0) {
            n--;
            if (n == 0) {
                notifyAll();
            } else {
                while (n != 0) {
                    wait();
                }
            }
        }
    }
}
