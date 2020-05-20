package com.tong.thinking.chapter15.s05.p369;

import com.tong.thinking.chapter07.s04.Custom;
import com.tong.thinking.chapter15.s04.p364.Generators;

import java.util.*;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator, 4);
        for (Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())), c);
        }
    }

}
