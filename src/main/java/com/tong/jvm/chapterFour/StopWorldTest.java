package com.tong.jvm.chapterFour;

import java.util.HashMap;

/**
 * @Description: 《實戰java虛擬機》第七十九頁示例：垃圾回收時的停頓現象
 * @Create: 2018/11/15 0015 上午 9:58
 */
public class StopWorldTest {

    /**
     * 消耗內存資源
     */
    public static class MyThread extends Thread {
        HashMap map = new HashMap();

        @Override
        public void run() {
            while (true) {
                if (map.size() * 512 / 1024 / 1024 >= 900) {
                    map.clear();
                    System.out.println("clean map");
                }
                byte[] b1;
                for (int i = 0; i < 100; i++) {
                    b1 = new byte[512];
                    map.put(System.nanoTime(), b1);
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 每0.1s輸出一次時間戳
     */
    public static class PrintThread extends Thread {
        public static final long startTime = System.currentTimeMillis();

        @Override
        public void run() {
            while (true) {
                long t = System.currentTimeMillis() - startTime;
                System.out.println(t / 1000 + "." + t % 1000);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        MyThread t = new MyThread();
        PrintThread p = new PrintThread();
        t.start();
        p.start();
    }

}
