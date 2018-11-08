package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第二十九頁示例：局部變量表槽位的複用
 * @Create: 2018/11/8 0008 上午 9:34
 */
public class LocalVariableTable {

    public static void localvar1() {
        int a = 0;
        System.out.println(a);
        //局部變量b無法複用a的槽位
        int b = 0;
    }

    public static void localvar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        //局部變量b複用a的槽位
        int b = 0;

    }

    public static void main(String[] args) {
        localvar1();
        localvar2();
    }
}
