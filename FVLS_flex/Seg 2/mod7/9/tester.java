
/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
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
