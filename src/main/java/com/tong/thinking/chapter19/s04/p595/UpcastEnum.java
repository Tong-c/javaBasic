package com.tong.thinking.chapter19.s04.p595;

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;//values() 方法由编译器插入，向上转型之后不可访问
        for (Enum en : e.getClass().getEnumConstants()) {//通过getEnumConstants() 取得所有enum实例
            System.out.println(en);
        }
    }
}
