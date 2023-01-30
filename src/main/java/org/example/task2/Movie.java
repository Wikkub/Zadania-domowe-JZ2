package org.example.task2;

import java.time.LocalDate;

public class Movie {
    String title;
    String type;
    long duration;
    LocalDate releaseDate;

    public Movie (String title, String type, long duration, LocalDate releaseDate) {
        this.title = title;
        this.type = type;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public String getTitle () {

        return title;
    }

    public String getType () {

        return type;
    }

    public long getDuration () {
        return duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
