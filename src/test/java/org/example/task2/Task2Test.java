package org.example.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void filteredMovies() {
        //given
        Movie movie1 = new Movie("Dupa", "komedia", 60, LocalDate.of(2018,12,01));
        Movie movie2 = new Movie("Kot", "horror", 30, LocalDate.of(2020,04, 8));
        Movie movie3 = new Movie("pies", "horror", 10, LocalDate.of(2016, 2, 29));


        List<Movie> movies = Arrays.asList(movie1, movie2, movie3);
        List<Movie> expectedResult = Arrays.asList(movie2);
        //when
        List<Movie> result = Task2.filteredMovies(movies);

        //then
        Assertions.assertEquals(expectedResult, result);
    }
}