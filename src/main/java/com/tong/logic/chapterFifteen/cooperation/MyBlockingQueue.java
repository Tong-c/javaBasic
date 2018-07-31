package com.tong.logic.chapterFifteen.cooperation;

import java.util.ArrayDeque;
import java.util.Queue;

/**
   * @Description:    生產者/消費者協作隊列
   * @Author:     仝闖
   * @Create:     2018/7/31 0031 下午 6:12
   */
public class MyBlockingQueue<E> {

    private Queue<E> queue = null;
    private int limit;
    public MyBlockingQueue(int limit){
        this.limit = limit;
        queue = new ArrayDeque<>(limit);
    }


    public synchronized void put(E e) throws InterruptedException {
        while (queue.size() == limit){
            wait();
        }
        queue.add(e);
        notifyAll();
    }


    public synchronized E take() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }

        E e = queue.poll();
        notifyAll();
        return e;
    }


}
