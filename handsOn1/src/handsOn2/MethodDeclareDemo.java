package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Movie Details Display using Method
Description : This program reads movie details from the user and displays them using a method.
*/

public class MethodDeclareDemo {

    static void displayMovieDetails(String movieName, String movieDescription, int movieDuration,
                                    String movieLanguage, String movieReleaseDate,
                                    String movieCountry, String movieGenre) {

        System.out.println("\n===== Movie Details =====");
        System.out.println("Movie Name        : " + movieName);
        System.out.println("Description       : " + movieDescription);
        System.out.println("Duration (mins)   : " + movieDuration);
        System.out.println("Language          : " + movieLanguage);
        System.out.println("Release Date      : " + movieReleaseDate);
        System.out.println("Country           : " + movieCountry);
        System.out.println("Genre             : " + movieGenre);
        System.out.println("==========================");
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter Movie Name:");
        String movieName = scanf.nextLine();

        System.out.println("Enter Movie Description:");
        String movieDescription = scanf.nextLine();

        System.out.println("Enter Movie Duration (minutes):");
        int movieDuration = scanf.nextInt();
        scanf.nextLine(); 

        System.out.println("Enter Movie Language:");
        String movieLanguage = scanf.nextLine();

        System.out.println("Enter Movie Release Date:");
        String movieReleaseDate = scanf.nextLine();

        System.out.println("Enter Movie Country:");
        String movieCountry = scanf.nextLine();

        System.out.println("Enter Movie Genre:");
        String movieGenre = scanf.nextLine();

        displayMovieDetails(movieName, movieDescription, movieDuration,
                            movieLanguage, movieReleaseDate,
                            movieCountry, movieGenre);
    }
}