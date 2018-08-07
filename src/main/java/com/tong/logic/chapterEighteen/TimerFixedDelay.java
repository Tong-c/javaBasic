package com.tong.logic.chapterEighteen;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description: Timer固定延時示例
 * @Author: 仝闖
 * @Create: 2018/8/7 0007 下午 6:21
 */
public class TimerFixedDelay {

    static class LongRunningTask extends TimerTask {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("long running finished");
        }
    }

    static class FixedDelayTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new LongRunningTask(), 10);
        timer.schedule(new FixedDelayTask(), 100, 1000);
    }
}
