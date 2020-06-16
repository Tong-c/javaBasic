package com.tong.thinking.chapter15.s12.p407;


public class C2 extends NotSelfBounded<C2> {

    C2 setAndGet(C2 arg){
        set(arg);
        return get();
    }


}
