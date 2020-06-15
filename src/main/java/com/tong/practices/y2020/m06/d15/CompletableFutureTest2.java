package com.tong.practices.y2020.m06.d15;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest2 {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            completableFuture.completeExceptionally(new RuntimeException("error"));
            completableFuture.complete(Thread
                    .currentThread()
                    .getName());
        }).start();

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
