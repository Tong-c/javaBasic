package com.tong.thinking.chapter19.s10.p610;

import com.tong.thinking.chapter19.s10.p609.Input;
import net.mindview.util.Generator;

public class RandomInputGenerator implements Generator<Input> {

    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
