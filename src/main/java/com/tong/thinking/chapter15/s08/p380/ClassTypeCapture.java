package com.tong.thinking.chapter15.s08.p380;

public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapture<House> cct2 = new ClassTypeCapture<>(House.class);
        System.out.println(cct2.f(new Building()));
        System.out.println(cct2.f(new House()));
    }
}
