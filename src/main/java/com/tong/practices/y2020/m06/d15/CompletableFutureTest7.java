package com.tong.practices.y2020.m06.d15;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest7 {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        try {
            System.out.println(future
                    .thenCompose(i -> CompletableFuture.supplyAsync(() -> {
                        return i + 1;
                    }))
                    .get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
