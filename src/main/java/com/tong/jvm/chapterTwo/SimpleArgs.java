package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第二十二頁示例
 * @Create: 2018/11/6 0006 上午 10:16
 */
public class SimpleArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            //打印main函數參數
            System.out.println("參數" + (i + 1) + ":" + args[i]);
        }
        //打印系統最大可用堆內存
        System.out.println("-Xmx" + Runtime.getRuntime().maxMemory() / 1000 / 1000 + "M");
    }
}
