package com.tong.logic.chapterFifteen.csynchronized;

/**
 * @Description: 用synchronized修飾的counter類
 * @Author: 仝闖
 * @Create: 2018/7/30 0030 下午 5:50
 */
public class Counter {

    private int count;

    public synchronized void incr() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
