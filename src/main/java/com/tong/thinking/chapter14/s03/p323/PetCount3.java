package com.tong.thinking.chapter14.s03.p323;

import java.util.LinkedHashMap;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super();
        }
    }
}
