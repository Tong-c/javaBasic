package com.tong.logic.chapterFifteen.cooperation;

import com.sun.org.apache.regexp.internal.RE;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.Callable;

 /**
   * @Description:    執行子綫程ExecuteThread
   * @Author:     仝闖    
   * @Create:     2018/8/1 0001 下午 6:17
   */
public class ExecuteThread<V> extends Thread {

    private V result = null;
    private Exception exception = null;
    private boolean done = false;
    private Callable<V> task;
    private Object lock;

    public ExecuteThread(Callable<V> task, Object lock){
        this.task = task;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            result = task.call();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            synchronized (lock){
                done = true;
                lock.notifyAll();
            }
        }
    }

    public V getResult(){
        return result;
    }

    public boolean isDone() {
        return done;
    }

    public Exception getException(){
        return exception;
    }
}
