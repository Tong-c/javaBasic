package com.tong.thinking.chapter14.s03.p323;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "com.tong.thinking.chapter14.s03.p323.Mutt",
            "com.tong.thinking.chapter14.s03.p323.Pug",
            "com.tong.thinking.chapter14.s03.p323.EgyptianMau",
            "com.tong.thinking.chapter14.s03.p323.Manx",
            "com.tong.thinking.chapter14.s03.p323.Cymric",
            "com.tong.thinking.chapter14.s03.p323.Rat",
            "com.tong.thinking.chapter14.s03.p323.Mouse",
            "com.tong.thinking.chapter14.s03.p323.Hamster"
    };

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        loader();
    }

}
