package com.tong.thinking.chapter19.s08.p601;

import java.util.EnumSet;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(AlarmPoints.BATHROOM);
        System.out.println(points);

        points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        System.out.println(points);

        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        System.out.println(points);

        points.removeAll(EnumSet.range(AlarmPoints.OFFICE1, AlarmPoints.OFFICE2));
        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
