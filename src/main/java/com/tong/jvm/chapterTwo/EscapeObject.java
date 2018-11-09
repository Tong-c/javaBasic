package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第三十四頁示例：非逃逸對象棧上分配
 * @Create: 2018/11/9 0009 上午 9:19
 */
public class EscapeObject {

    public static class User {
        public int id = 0;
        public String name = "";
    }


    public static void alloc() {
        User u = new User();//非逃逸對象
        u.id = 5;
        u.name = "geym";
    }

    //指定jvm參數：-server -Xmx10m -Xms10m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-UseTLAB -XX:+EliminateAllocations
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }


}
