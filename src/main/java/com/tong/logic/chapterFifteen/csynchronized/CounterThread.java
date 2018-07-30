package com.tong.logic.chapterFifteen.csynchronized;

 /**
   * @Description:    多綫程訪問synchronized保護的counter對象
   * @Author:     仝闖    
   * @Create:     2018/7/30 0030 下午 5:52
   */
public class CounterThread extends Thread{

    Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

     @Override
     public void run() {
         for(int i = 0; i < 1000;i++){
             counter.incr();
         }
     }

     public static void main(String[] args) throws InterruptedException {
         int num = 1000;
         Counter counter = new Counter();
         Thread[] threads = new Thread[num];
         for(int i = 0;i < num;i++){
             threads[i] = new CounterThread(counter);
             threads[i].start();
         }

         for(int i = 0;i < num;i++){
             threads[i].join();
         }

         System.out.println(counter.getCount());
     }
 }
