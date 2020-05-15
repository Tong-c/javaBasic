package com.tong.thinking.chapter14.s04;

public class PowerSteeringBelt extends Belt {

    public static class Factory implements com.tong.thinking.chapter14.s04.Factory<PowerSteeringBelt> {

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
