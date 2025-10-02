package com.backontrack.goodpatterns.challenges.moviestore;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.printTitlesFromMap(movieStore.getMovies());
    }
}
