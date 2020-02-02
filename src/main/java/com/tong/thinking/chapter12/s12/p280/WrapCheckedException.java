package com.tong.thinking.chapter12.s12.p280;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WrapCheckedException {

    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where am I?");
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
