package com.tong.logic.chapterFour.detail.three;

public class Base {
    protected int currentStep;
    protected void step1(){

    }

    protected void step2(){

    }

    public void action(){
        this.currentStep = 1;
        step1();
        this.currentStep = 2;
        step2();
    }
}
