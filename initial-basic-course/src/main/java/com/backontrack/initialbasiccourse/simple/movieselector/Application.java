package com.backontrack.initialbasiccourse.simple.movieselector;

public class Application {
    public static void main(String[] args) {
        MovieSelector movieSelector = new MovieSelector();

        movieSelector.addMovieToAList("Pulp Fiction", "Leon", "Star Wars", "Lord of the Rings",
                "Desperado", "Easy Rider");

        System.out.println("Random movie: " + movieSelector.getRandomMovie() + "\n");
        movieSelector.printFavouriteMovies();
        System.out.println("");
        System.out.println("Selected movie [correct]: " + movieSelector.getSelectedMovie(0));
        System.out.println("Selected movie [incorrect]: " + movieSelector.getSelectedMovie(19));

    }
}