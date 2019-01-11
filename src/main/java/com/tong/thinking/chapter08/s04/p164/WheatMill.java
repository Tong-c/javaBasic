package com.tong.thinking.chapter08.s04.p164;

public class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();//協變返回類型，子類中的重寫方法返回父類被重寫方法的返回值的子類型
    }
}
