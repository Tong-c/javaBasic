package com.tong.concurrency.huangwenhai.chapter02.s02.p34;

import com.tong.concurrency.huangwenhai.utils.Tools;

/**
 * @author: Tong Chuang
 * @date: 2019/10/25
 */
public class RaceConditionDemo {

    public static void main(String[] args) {
        int numberOfThreads = args.length > 0 ? Short.valueOf(args[0]) : Runtime.getRuntime().availableProcessors();
        Thread[] workerThreads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            workerThreads[i] = new WorkerThread(i, 10);
        }

        for (Thread ct : workerThreads) {
            ct.start();
        }

    }


    static class WorkerThread extends Thread {
        private final int requestCount;

        public WorkerThread(int id, int requestCount) {
            super("worker-" + id);
            this.requestCount = requestCount;
        }

        @Override
        public void run() {
            int i = requestCount;
            String requestID;
            RequestIDGenerator requestIDGen = RequestIDGenerator.getInstance();
            while (i-- > 0) {
                requestID = requestIDGen.nextID();
                processRequest(requestID);
            }
        }

        private void processRequest(String requestID) {
            Tools.randomPause(50);
            System.out.printf("%s got requestID: %s %n", Thread.currentThread().getName(), requestID);
        }
    }
}
