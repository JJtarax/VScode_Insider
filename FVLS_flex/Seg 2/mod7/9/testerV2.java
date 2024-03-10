import java.util.*;

/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

public class testerV2 {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Mean Girls", 2024, "Paramount Pictures"));
        movieList.add(new Movie("The Matrix", 1999, "Warner Bros."));
        movieList.add(new Movie("The Grinch", 2018, "Universal Pictures"));
        movieList.add(new Movie("Avengers: Endgame", 2019, "Marvel Studios"));
        movieList.add(new Movie("The Dark Knight", 2008, "Warner Bros."));
        movieList.add(new Movie("Meet the Robinsons", 2008, "Disney"));
        movieList.add(new Movie("Transformers", 2007, "Paramount Pictures"));
        movieList.add(new Movie("Bumblebee", 2018, "Paramount Pictures"));
        movieList.add(new Movie("Oppenheimer", 2023, "Universal Pictures"));
        movieList.add(new Movie("Wonka", 2023, "Warner Bros. Pictures"));

        System.out.println("Here is your list");
        System.out.println("\nHere is your list sorted by title in descending order:\n");
        sortByMovieTitle(movieList, true);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by title in ascending order:\n");
        sortByMovieTitle(movieList, false);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by year in descending order:\n");
        sortByMovieYear(movieList, true);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by year in ascending order:\n");
        sortByMovieYear(movieList, false);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by studio in descending order:\n");
        sortByMovieStudio(movieList, true);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by studio in ascending order:\n");
        sortByMovieStudio(movieList, false);
        printAllMovie(movieList);
    }

    public static void sortByMovieYear(ArrayList<Movie> movieList, boolean descending) {
        int n = movieList.size();
        for (int i = 1; i < n; ++i) {
            Movie key = movieList.get(i);
            int j = i - 1;
            while (j >= 0 && (descending ? movieList.get(j).getYear() < key.getYear()
                    : movieList.get(j).getYear() > key.getYear())) {
                movieList.set(j + 1, movieList.get(j));
                j = j - 1;
            }
            movieList.set(j + 1, key);
        }
    }

    public static void sortByMovieTitle(ArrayList<Movie> movieList, boolean descending) {
        int n = movieList.size();
        for (int i = 1; i < n; ++i) {
            Movie key = movieList.get(i);
            int j = i - 1;
            while (j >= 0 && (descending ? movieList.get(j).getTitle().compareTo(key.getTitle()) < 0
                    : movieList.get(j).getTitle().compareTo(key.getTitle()) > 0)) {
                movieList.set(j + 1, movieList.get(j));
                j = j - 1;
            }
            movieList.set(j + 1, key);
        }
    }

    public static void sortByMovieStudio(ArrayList<Movie> movieList, boolean descending) {
        int n = movieList.size();
        for (int i = 1; i < n; ++i) {
            Movie key = movieList.get(i);
            int j = i - 1;
            while (j >= 0 && (descending ? movieList.get(j).getStudio().compareTo(key.getStudio()) < 0
                    : movieList.get(j).getStudio().compareTo(key.getStudio()) > 0)) {
                movieList.set(j + 1, movieList.get(j));
                j = j - 1;
            }
            movieList.set(j + 1, key);
        }
    }

    public static void printAllMovie(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}