package com.tong.logic.chapterTen.enumSet;

import java.util.Set;

public class Worker {
    String name;
    Set<Day> availableDays;

    public Worker(String name,Set<Day> availableDays){
        this.name = name;
        this.availableDays = availableDays;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Day> getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(Set<Day> availableDays) {
        this.availableDays = availableDays;
    }
}
