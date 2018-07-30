package com.tong.logic.chapterFifteen.csynchronized;

 /**
   * @Description:    synchronized修飾靜態方法
   * @Author:     仝闖    
   * @Create:     2018/7/30 0030 下午 6:04
   */
public class StaticCounter {

    private static int count = 0;

    public static synchronized void incr(){
        count++;
    }

    public static synchronized int getCount(){
        return count;
    }

}
