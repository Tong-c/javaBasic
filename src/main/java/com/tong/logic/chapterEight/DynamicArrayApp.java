package com.tong.logic.chapterEight;

public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();

        ints.add(100);
        ints.add(34);

        numbers.addAll(ints);
    }


}
