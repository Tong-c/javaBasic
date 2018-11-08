package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第二十六頁示例
 * @Create: 2018/11/7 0007 上午 9:20
 */
public class TestStackDeep {
    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
