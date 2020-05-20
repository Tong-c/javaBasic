package com.tong.thinking.chapter15.s04.p364;

import com.tong.thinking.chapter15.s03.Coffee;
import com.tong.thinking.chapter15.s03.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: Tong Chuang
 * @date: 2020/5/19
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffees) {
            System.out.println(c);
        }
    }
}
