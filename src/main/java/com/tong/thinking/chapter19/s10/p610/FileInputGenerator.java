package com.tong.thinking.chapter19.s10.p610;

import com.tong.thinking.chapter19.s10.p609.Input;
import net.mindview.util.Generator;
import net.mindview.util.TextFile;

import java.util.Iterator;

public class FileInputGenerator implements Generator<Input> {

    private Iterator<String> input;

    public FileInputGenerator(String fileName) {
        input = new TextFile(fileName, ":").iterator();
    }

    @Override
    public Input next() {
        if (!input.hasNext()) {
            return null;
        }
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
