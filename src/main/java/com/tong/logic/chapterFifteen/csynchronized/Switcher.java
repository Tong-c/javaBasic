package com.tong.logic.chapterFifteen.csynchronized;

/**
 * @Description: 使用volatile取代synchronized保證內存可見性
 * @Author: 仝闖
 * @Create: 2018/7/30 0030 下午 6:20
 */
public class Switcher {

    private volatile boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        this.on = on;
    }
}
