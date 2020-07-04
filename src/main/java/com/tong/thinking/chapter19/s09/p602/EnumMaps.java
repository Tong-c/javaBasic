package com.tong.thinking.chapter19.s09.p602;

import com.tong.thinking.chapter19.s08.p601.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);

        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire !");
            }
        });

        em.put(AlarmPoints.BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom alert !");
            }
        });

        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }

        em.get(AlarmPoints.UTILITY).action();
    }
}
