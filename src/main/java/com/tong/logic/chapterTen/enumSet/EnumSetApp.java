package com.tong.logic.chapterTen.enumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static void main(String[] args) {
        Worker[] workers = new Worker[]{new Worker("張三", EnumSet.of(Day.MONDAY,Day.TUESDAY,Day.WEDNESDAY,Day.FRIDAY)),
                new Worker("李四",EnumSet.of(Day.TUESDAY,Day.THURSDAY,Day.SATURDAY)),new Worker("王五",EnumSet.of(Day.TUESDAY,Day.THURSDAY))};

        Set<Day> days = EnumSet.allOf(Day.class);
        for(Worker w:workers){
            days.removeAll(w.getAvailableDays());
        }
        System.out.println(days);
    }
}
