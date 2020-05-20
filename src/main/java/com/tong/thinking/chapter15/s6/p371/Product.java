package com.tong.thinking.chapter15.s6.p371;

import net.mindview.util.Generator;

import java.util.Properties;
import java.util.Random;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int IDnumber, String descr, double price) {
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ". price: $" + price;
    }

    public void priceChange(double change
    ) {
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {

        private Random rand = new Random(47);

        @Override
        public Product next() {
            return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000) + 0.99);
        }
    };

}
