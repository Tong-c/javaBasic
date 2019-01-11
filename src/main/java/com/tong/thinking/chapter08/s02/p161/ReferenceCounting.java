package com.tong.thinking.chapter08.s02.p161;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composing) {
            c.dispose();//共享對象的清理，需要跟蹤引用計數，決定該對象的清理時機
        }
    }
}
