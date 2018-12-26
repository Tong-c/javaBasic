package com.tong.thinking.chapter07.s05.p137;

public class Car {
    public Engine engine = new Engine();
    private Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(27);
    }
}
