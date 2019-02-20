package com.tong.effective.chapterSix.p31;


public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;

    /**
     * 枚舉與int值相關聯，所有的枚舉都有一個ordinal方法，返回每個枚舉常量在類型中的數字位置
     **/
    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
