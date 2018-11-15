package com.tong.jvm.chapterFour;

import java.lang.ref.SoftReference;

/**
 * @Description: 《實戰java虛擬機》第七十二頁示例：軟引用在系統堆內存不足時回收
 * @Create: 2018/11/15 0015 上午 9:30
 */
public class SoftRef {
    public static class User {

        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[id=" + String.valueOf(id) + ",name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        User u = new User(1, "geym");
        SoftReference<User> userSoftRef = new SoftReference<>(u);
        u = null;

        System.out.println(userSoftRef.get());
        System.gc();
        System.out.println("After GC:");
        System.out.println(userSoftRef.get());

        byte[] b = new byte[1024 * 925 * 7];
        System.gc();
        System.out.println(userSoftRef.get());
    }
}
