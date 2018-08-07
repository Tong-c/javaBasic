package com.tong.logic.chapterEighteen;

import java.util.Random;
import java.util.concurrent.*;

/**
   * @Description:    任務執行服務的基本示例
   * @Author:     仝闖
   * @Create:     2018/8/7 0007 下午 5:44
   */
public class BasicDemo {

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws InterruptedException {
            int sleepSeconds = new Random().nextInt(1000);
            Thread.sleep(sleepSeconds);
            return sleepSeconds;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Task());
        Thread.sleep(100);
        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
