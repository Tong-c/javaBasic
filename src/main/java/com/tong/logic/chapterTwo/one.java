package com.tong.logic.chapterTwo;


import java.io.UnsupportedEncodingException;

public class one {


    //亂碼恢復
    public static void recover(String str) throws UnsupportedEncodingException {
        String[] charsets = new String[]{"windows-1252", "GB18030", "Big5", "UTF-8"};
        for (int i = 0; i < charsets.length; i++) {
            for (int j = 0; j < charsets.length; j++) {
                if (i != j) {
                    String s = new String(str.getBytes(charsets[i]), charsets[j]);
                    System.out.println("----- 原來編碼（A）假設是：" + charsets[j] + ",被錯誤解讀為了（B）" + charsets[i]);
                    System.out.println(s);
                    System.out.println();
                }
            }
        }
    }


    //char的表示，本質是一個正整數對應一個unicode編號
    public void charRelated() {
        char a = 'A';
        char b = '嗎';
        char c = 39532;//十進制常量
        char d = 0x9a5c;//十六進制常量
        char e = '\u9a5c';//Unicode字符

        System.out.println(Integer.toBinaryString(b));
    }
}
