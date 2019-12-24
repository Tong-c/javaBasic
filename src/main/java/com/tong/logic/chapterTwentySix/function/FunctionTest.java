package com.tong.logic.chapterTwentySix.function;

import com.tong.logic.chapterTwentySix.predicate.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student[]{new Student("zhangsan", 89d), new Student("lisi", 89d), new Student("wangwu", 98d)});
        List<String> name = map(students, t -> t.getName());
        students = map(students, t -> new Student(t.getName().toUpperCase(), t.getScore()));

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> retList = new ArrayList<>(list.size());
        for (T e : list) {
            retList.add(mapper.apply(e));
        }
        return retList;
    }
}
