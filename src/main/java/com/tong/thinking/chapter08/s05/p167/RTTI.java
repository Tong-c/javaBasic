package com.tong.thinking.chapter08.s05.p167;

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
//        x[1].u();
        ((MoreUseful)x[1]).u();//向下轉型，運行時類型識別
    }
}
