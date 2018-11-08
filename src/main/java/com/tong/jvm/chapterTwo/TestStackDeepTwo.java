package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第二十七頁示例
 * @Create: 2018/11/8 0008 上午 9:13
 */
public class TestStackDeepTwo {

    private static int count = 0;


    public static void recursion(long a, long b, long c) {
        //過多局部變量，使得局部變量表膨脹，每一次函數調用佔用更多棧空間，導致函數嵌套調用次數減少
        long e = 1, f = 2, g = 3, h = 4, i = 5, k = 6, q = 7, x = 8, y = 9, z = 10;
        count++;
        recursion(a, b, c);
    }

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
//            recursion();
            recursion(1, 2, 3);
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
