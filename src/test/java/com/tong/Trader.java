package com.tong;

public class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String city) {
        this.name = n;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader: " + this.name + " in " + this.city;
    }
}
