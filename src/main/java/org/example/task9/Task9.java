package org.example.task9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Przygotuj klasę Movie o następujących polach:
 * - title (String)
 * - reżyser (String)
 * - rok wydania (int)
 *
 * Dodaj dwa jednakowe obiekty do list i HashSetu:
 * * najpierw bez implementacji metody hashCode i metody Equals
 * * z implementacją metody equals
 * * z implemenetacją metody hashCode
 * Zaobserwuj różnicę.
 *
 * Dla powyższej listy liczba duplikatów powinna być równa: 2
 *
 * NAPISZ TESTY JEDNOSTKOWE !!!
 */
public class Task9 {
    public static void main(String[] args) {
        Movie movie = new Movie("Test", "Wiktoria", 2023);
        Movie movie2 = new Movie("Test", "Wiktoria", 2023);

        System.out.println(movie2.equals(movie));
        System.out.println(movie.hashCode());
        System.out.println(movie2.hashCode());

        List <Movie> list = new ArrayList<>();
        list.add(movie);
        list.add(movie2);
        System.out.println(list);

        HashSet<Movie> listHashSet = new HashSet<>();
        listHashSet.add(movie);
        listHashSet.add(movie2);
        System.out.println(listHashSet);

    }
}
