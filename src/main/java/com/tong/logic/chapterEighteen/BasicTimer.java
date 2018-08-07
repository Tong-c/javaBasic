package com.tong.logic.chapterEighteen;

import java.util.Timer;
import java.util.TimerTask;

/**
   * @Description:    Timer基本示例
   * @Author:     仝闖    
   * @Create:     2018/8/7 0007 下午 6:18
   */
public class BasicTimer {

    static class DelayTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("delayed task");
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new DelayTask(),1000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
    }
}
