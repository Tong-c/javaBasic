package com.tong;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    List<Apple> inventory = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        inventory.add(new Apple("红色", Double.valueOf(3.0)));
        inventory.add(new Apple("青色", Double.valueOf(2.0)));
    }

    @Test
    public void test1() {
        inventory.sort(new AppleComparator());
    }


    @Test
    public void test2() {
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }


    @Test
    public void test3() {
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
    }


    @Test
    public void test4() {
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
    }

}
