package com.tong.logic.chapterTwentySix.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[]{new Student("zhangsan", 89d), new Student("lisi", 89d), new Student("wangwu", 98d)});
        students = filter(students, t -> t.getScore() > 90);
        System.out.println(students);
    }


    private static <E> List<E> filter(List<E> list, Predicate<E> pred) {
        List<E> retList = new ArrayList<>();
        for (E e : list) {
            if (pred.test(e)) {
                retList.add(e);
            }
        }
        return retList;
    }


}
