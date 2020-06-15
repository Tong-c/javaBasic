package com.tong.practices.y2020.m06.d15;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest5 {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        future.thenAccept(System.out::println);
    }
}
