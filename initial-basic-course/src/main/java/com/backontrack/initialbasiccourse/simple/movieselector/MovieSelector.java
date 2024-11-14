package com.backontrack.initialbasiccourse.simple.movieselector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieSelector {
    private final List<String> movies = new ArrayList<>();
    private final Random random = new Random();

    public void addMovieToAList(String... movie) {
        for (int i = 0; i < movie.length; i++ ) {
            movies.add(movie[i]);
        }
    }

    public String getRandomMovie() {
        int randomNumber = random.nextInt(movies.size());
        return movies.get(randomNumber);
    }

    public String getSelectedMovie(int i) {
        if(i <= movies.size()) {
            return movies.get(i);
        } else {
            return "No such movie number";
        }
    }

    public void printFavouriteMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + ": " + movies.get(i));
        }
    }
}
