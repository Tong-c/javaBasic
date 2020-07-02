package com.tong.thinking.chapter19.s11.p613;

public interface Item {

    Outcome compete(Item it);

    Outcome eval(Paper p);

    Outcome eval(Scissors s);

    Outcome eval(Rock r);
}
