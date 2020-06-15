package com.tong.practices.y2020.m06.d15;

import java.util.concurrent.*;

public class FutureTest {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            return Thread
                    .currentThread()
                    .getName();
        });

        try {
            String result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
