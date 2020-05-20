package com.tong.practices.y2020.m05.d20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hahah");
        System.out.println(list.get(0).getClass().getSimpleName());

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        System.out.println(list2.get(0).getClass().getSimpleName());
    }

}
