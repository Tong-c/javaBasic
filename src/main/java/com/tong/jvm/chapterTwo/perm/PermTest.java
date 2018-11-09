package com.tong.jvm.chapterTwo.perm;

import java.util.HashMap;

/**
 * @Description: 《實戰JAVA虛擬機》第三十五頁示例：使用CGLIB庫生成大量的動態類，測試方法區溢出
 * @Create: 2018/11/9 0009 上午 9:47
 */
public class PermTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            for (i = 0; i < 100000; i++) {
                CglibBean bean = new CglibBean("com.tong.jvm.chapterTwo.perm" + i, new HashMap());
            }
        } catch (Exception e) {
            System.out.println("total create count:" + i);
        }
    }
}
