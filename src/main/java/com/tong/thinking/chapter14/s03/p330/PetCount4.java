package com.tong.thinking.chapter14.s03.p330;

import com.tong.thinking.chapter14.s03.p323.Pet;
import com.tong.thinking.chapter14.s03.p323.Pets;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
