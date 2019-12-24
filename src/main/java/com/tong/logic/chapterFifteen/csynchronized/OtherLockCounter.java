package com.tong.logic.chapterFifteen.csynchronized;

/**
 * @Description: 使用單獨對象作為鎖的Counter類
 * @Author: 仝闖
 * @Create: 2018/7/30 0030 下午 6:14
 */
public class OtherLockCounter {

    private int count;
    private Object lock = new Object();

    public void incr() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
