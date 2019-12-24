package com.tong;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertTrue;

public class StreamFindTest {

    @Test
    public void createStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Optional<String> result = list.stream().findAny();

        assertTrue(result.isPresent());
    }
}
