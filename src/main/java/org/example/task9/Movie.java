package org.example.task9;

import java.util.Objects;

public class Movie {
    private String tile;
    private String director;
    private int publicationYear;

    public Movie(String t, String d, int p) {
        this.tile = t;
        this.director = d;
        this.publicationYear = p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return this.publicationYear == movie.publicationYear &&
                Objects.equals(tile, movie.tile) &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tile, director, publicationYear);
    }

}
