package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();
        Movie[] movies = MoviesArray.findAll();

        printMovies(movies);

        System.out.println(
                "What you wanna do?\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n");

    }

 public static void printMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName());

        }
    }
}

