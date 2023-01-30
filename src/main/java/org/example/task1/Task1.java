package org.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Na podstawie poniższej listy napisz mechanizm, który zwróci tylko elementy unikalne:
 * List<Integer> values = new ArrayList<>();
 * values.add(10);
 * values.add(11);
 * values.add(10);
 * values.add(11);
 * values.add(12);
 * values.add(11);
 * <p>
 * NAPISZ TEST JEDNOSTKOWY SPRAWDZAJĄCY POPRAWNOŚĆ DZIAŁANIA METODY
 */

public class Task1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream().collect(Collectors.toSet()).stream().toList();

    }
}
