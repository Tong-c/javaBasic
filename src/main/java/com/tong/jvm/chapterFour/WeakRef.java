package com.tong.jvm.chapterFour;

import java.lang.ref.WeakReference;

/**
 * @Description: 《實戰java虛擬機》第七十六頁示例：弱引用，系統GC時，只要發現弱引用，不管系統對空間使用情況如何，都會將對象進行回收
 * @Create: 2018/11/15 0015 上午 9:50
 */
public class WeakRef {
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
        User u = new User(1, "gyem");
        WeakReference<User> userWeakRef = new WeakReference<>(u);
        u = null;

        System.out.println(userWeakRef.get());
        System.gc();
        System.out.println("After GC");
        System.out.println(userWeakRef.get());

    }
}
