package com.tong.logic.chapterSeven;

public class RedPacketApp {

    public static void main(String[] args) {
        RandomRedPacket redPacket = new RandomRedPacket(1000, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(redPacket.nextMoney() + " ");

        }
    }
}
