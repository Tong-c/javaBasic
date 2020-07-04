package com.tong.thinking.chapter19.s11.p613;

public class Rock implements Item {

    @Override
    public Outcome compete(Item it) {
        return null;
    }

    @Override
    public Outcome eval(Paper p) {
        return null;
    }

    @Override
    public Outcome eval(Scissors s) {
        return null;
    }

    @Override
    public Outcome eval(Rock r) {
        return null;
    }

}
