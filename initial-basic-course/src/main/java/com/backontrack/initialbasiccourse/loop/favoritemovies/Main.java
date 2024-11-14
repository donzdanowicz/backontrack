package com.backontrack.initialbasiccourse.loop.favoritemovies;

public class Main {
    public static void main(String[] args) {
        System.out.println("Favorite Movies:");

        String[] favouriteMovies = new String[10];

        favouriteMovies[0] = "Lord of the Rings";
        favouriteMovies[1] = "Pulp Fiction";
        favouriteMovies[2] = "Taxi";
        favouriteMovies[3] = "Easy Rider";
        favouriteMovies[4] = "Star Wars";
        favouriteMovies[5] = "Silence of the Lambs";
        favouriteMovies[6] = "Leon";
        favouriteMovies[7] = "Braveheart";
        favouriteMovies[8] = "The Good, the Bad and the Ugly";
        favouriteMovies[9] = "Indiana Jones";

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ". " + favouriteMovies[i]);
        }

    }
}