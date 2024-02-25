
/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class testerV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        // Movie list
        movies.add(new Movie("Avengers: Endgame", 2019, "Marvel Studios"));
        movies.add(new Movie("Oppenheimer", 2023, "Universal Pictures"));
        movies.add(new Movie("The Dark Knight", 2008, "Warner Bros. Pictures"));
        movies.add(new Movie("Mean Girls", 2024, "Paramount Pictures"));
        movies.add(new Movie("The Matrix", 1999, "Warner Bros. Pictures"));
        movies.add(new Movie("Meet the Robinsons", 2007, "Disney"));
        movies.add(new Movie("Transformers", 2007, "Paramount Pictures"));
        movies.add(new Movie("Bumblebee", 2018, "Paramount Pictures"));
        movies.add(new Movie("Wonka", 2023, "Warner Bros. Pictures"));
        movies.add(new Movie("The Grinch", 2018, "Universal Pictures"));

        // Asking the user in what order they want the movies organized in
        System.out.println("How would you like to organize the movies? (title/year/studio)");
        String choice = in.nextLine();
        System.out.println("Would you like this in ascending order or descending order?");
        String order = in.nextLine();

        in.close();

        // Sorting the movies
        if (choice.equalsIgnoreCase("title")) {
            Collections.sort(movies, new Comparator<Movie>() {
                @Override
                public int compare(Movie m1, Movie m2) {
                    return m1.getTitle().compareTo(m2.getTitle());
                }
            });
        } else if (choice.equalsIgnoreCase("year")) {
            Collections.sort(movies, new Comparator<Movie>() {

                @Override
                public int compare(Movie m1, Movie m2) {
                    return Integer.compare(m1.getYear(), m2.getYear());
                }
            });
        } else if (choice.equalsIgnoreCase("studio")) {
            Collections.sort(movies, new Comparator<Movie>() {

                @Override
                public int compare(Movie m1, Movie m2) {
                    return m1.getStudio().compareTo(m2.getStudio());
                }

            });
        }
        if (order.equalsIgnoreCase("descending")) {
            Collections.reverse(movies);
        }

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllMovie(movies);
    }

    public static void printAllMovie(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
