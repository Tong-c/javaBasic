package com.tong.logic.chapterFifteen.csynchronized;

 /**
   * @Description:    synchronized代碼塊修飾的StaticCounter類
   * @Author:     仝闖    
   * @Create:     2018/7/30 0030 下午 6:12
   */
public class BlockStaticCounter {

    private static int count = 0;
    public static void incr(){
        synchronized (BlockStaticCounter.class){
            count++;
        }
    }

    public static int getCount(){
        synchronized (BlockStaticCounter.class){
            return count;
        }
    }
}
