package com.tong.practices.y2020.m06.d15;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest8 {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        CompletableFuture<String> f = future.thenCombine(CompletableFuture.supplyAsync(() -> {
            return 20;
        }), (x, y) -> {
            return "计算结果:" + x + y;
        });

        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
