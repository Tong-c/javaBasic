package com.tong.thinking.chapter08.s05.p165;

//狀態模式
public class Stage {
    private Actor actor = new HappyActor();

    //狀態切換
    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}
