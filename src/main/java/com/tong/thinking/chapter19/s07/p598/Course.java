package com.tong.thinking.chapter19.s07.p598;

import com.tong.thinking.chapter19.s06.p596.Enums;
import com.tong.thinking.chapter19.s07.p597.Food;

public enum Course {

    APPETIZER(Food.Dessert.class);

    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}
