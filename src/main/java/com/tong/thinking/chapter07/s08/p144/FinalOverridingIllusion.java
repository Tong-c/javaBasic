package com.tong.thinking.chapter07.s08.p144;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridePrivate op = op2;
        //無法直接調用op.f(),因為父類方法聲明為private,所以它就不是基類的接口的一部分，不存在重寫關係，子類并沒有覆蓋該方法
        //op.f();

        WithFinals wf = op2;
    }
}
