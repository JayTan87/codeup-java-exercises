package movies;
import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static Movie[] addMovie(Movie[] movies, Movie element) {

        Movie[] movieCollection = Arrays.copyOf(findAll(), findAll().length + 1);
        for (int i = 0; i < findAll().length-1; i++) {
            if (element.getCategory().equals("animated")) {
                movieCollection[i] = element;
            }
        }
        return movieCollection;
    }
    public static void main(String[] args) {
        Input inputScan = new Input();
        System.out.println("How would you like to view Movies?");
        System.out.println("0   -   exit");
        System.out.println("1   -   view all movies");
        System.out.println("2   -   view movies in the animated category");
        System.out.println("3   -   view movies in the drama category");
        System.out.println("4   -   view movies in the horror category");
        System.out.println("5   -   view movies in the scifi category");
        System.out.println("Enter your choice: ");
        int userInput = inputScan.getInt();

        if (userInput == 1) {
            for (Movie element : findAll()) {
                System.out.println(element.getName());
                System.out.println(element.getCategory());
            }
        } else if (userInput == 2) {
            for(Movie element : findAll()) {
//                addMovie(findAll(), element.getCategory());
            }
//            Movie[] animatedMovies = new Movie[0];
//            for (Movie element : findAll()) {
//                int i = 0;
//                if (element.getCategory().equals("animated")) {
//                    animatedMovies[element] = element.getName();
//                    System.out.println(element.getCategory("animated"));
//                    i++;
                }
            }
        }
    }
}
