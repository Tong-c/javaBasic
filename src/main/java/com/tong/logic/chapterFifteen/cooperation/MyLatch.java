package com.tong.logic.chapterFifteen.cooperation;

 /**
   * @Description:    等待結束-協作對象MyLatch
   * @Author:     仝闖    
   * @Create:     2018/8/1 0001 下午 5:52
   */
public class MyLatch {

    private int count;
    public MyLatch(int count){
        this.count = count;
    }

    public synchronized void await() throws InterruptedException {
        while (count > 0){
            wait();
        }
    }

    public synchronized void countDown(){
        count--;
        if(count <= 0){
            notifyAll();
        }
    }
}
