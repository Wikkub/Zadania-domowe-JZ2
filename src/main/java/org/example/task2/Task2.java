package org.example.task2;

import java.time.LocalDate;
import java.util.List;

/**
 * Zadanie 2
 /**
 * Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
 *     List<Movie> movies = Arrays.asList(….)
 *     gdzie Movie to klasa
 *     class Movie {
 *     String title;
 *     String type;
 *     long duration;//min
 *     LocalDate releaseDate
 *     }
 *     zwróci listę filmów, gdzie:
 * - długość filmu będzie większa niż 20 min
 * - rok wydania nie będzie starszy niż 2018
 * - typ to horror
 *     NAPISZ TEST JEDNOSTKOWY SPRAWDZAJĄCY POPRAWNOŚĆ NAPISANEGO KODU
 */

public class Task2 {

    public static List<Movie> filteredMovies (List<Movie> movies) {
        var filteredMovies = movies.stream()
                .filter(movie -> movie.getDuration() > 20)
                .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.of(2017, 12,31)))
                .filter(movie -> movie.getType().equals("horror"))
                .toList();
        return filteredMovies;
    }
}
