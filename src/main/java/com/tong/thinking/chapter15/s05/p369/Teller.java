package com.tong.thinking.chapter15.s05.p369;

import net.mindview.util.Generator;
import sun.nio.cs.Surrogate;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller() {

    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };



}
