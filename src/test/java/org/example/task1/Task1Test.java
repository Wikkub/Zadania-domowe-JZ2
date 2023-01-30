package org.example.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Task1Test {

    @Test
    void removeDuplicates() {
        //given
        List<Integer> list = List.of(10, 11, 10, 11, 12, 11);

        //when
        List<Integer> result = Task1.removeDuplicates(list);


        //then
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(true, result.contains(10));
        Assertions.assertEquals(true, result.stream().anyMatch(number -> number == 11));
        Assertions.assertEquals(true, result.contains(12));
    }
}