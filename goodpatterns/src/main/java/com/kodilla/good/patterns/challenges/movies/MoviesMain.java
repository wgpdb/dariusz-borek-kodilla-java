package com.kodilla.good.patterns.challenges.movies;

import java.util.stream.Collectors;

public class MoviesMain {

    public static void main(String[] args) {

        String movieTitlesStream;

        MovieStore movieStore = new MovieStore();

        movieTitlesStream = movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieTitlesStream);
    }
}