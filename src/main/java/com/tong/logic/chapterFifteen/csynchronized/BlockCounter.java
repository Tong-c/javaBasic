package com.tong.logic.chapterFifteen.csynchronized;

/**
 * @Description: synchronized代碼塊修飾的Counter類
 * @Author: 仝闖
 * @Create: 2018/7/30 0030 下午 6:08
 */
public class BlockCounter {

    private int count;

    public void incr() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}
