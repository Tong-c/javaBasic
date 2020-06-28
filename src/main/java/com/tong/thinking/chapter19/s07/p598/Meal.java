package com.tong.thinking.chapter19.s07.p598;

import com.tong.thinking.chapter19.s07.p597.Food;

public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("---");
        }
    }
}
