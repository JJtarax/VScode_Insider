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
        movieList.add(new Movie("Meet the Robinsons", 2008, "20th Century Fox"));
        movieList.add(new Movie("Transformers", 2007, "Paramount Pictures"));
        movieList.add(new Movie("Bumblebee", 2018, "Paramount Pictures"));
        movieList.add(new Movie("Oppenheimer", 2023, "Universal Pictures"));
        movieList.add(new Movie("Wonka", 2023, "Warner Bros. Pictures"));

        System.out.println("Here is your list");
        System.out.println("\nHere is your list sorted by title in descending order:\n");
        insertionSortByTitle(movieList, 1);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by title in ascending order:\n");
        insertionSortByTitle(movieList, 2);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by year in descending order:\n");
        insertionSortByYear(movieList, 1);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by year in ascending order:\n");
        insertionSortByYear(movieList, 2);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by studio in descending order:\n");
        insertionSortByStudio(movieList, 1);
        printAllMovie(movieList);

        System.out.println("\nHere is your list sorted by studio in ascending order:\n");
        insertionSortByStudio(movieList, false);
        printAllMovie(movieList);
    }

    public static void insertionSortByYear(ArrayList<Movie> source, ArrayList<Movie> dest) {
        for (int i = 0; i < source.size(); i++) {
            Movie next = source.get(i);
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (next.getYear() > dest.get(k - 1).getYear()) {
                    insertIndex = k;
                } else {
                    dest.set(k, dest.get(k - 1));
                    k--;
                }
            }
            dest.set(insertIndex, next);
        }
    }

    public static void insertionSortByTitle(ArrayList<Movie> source, ArrayList<Movie> dest) {
        for (int i = 0; i < source.size(); i++) {
            Movie next = source.get(i);
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (next.getTitle().compareTo(dest.get(k - 1).getTitle()) > 0) {
                    insertIndex = k;
                } else {
                    dest.set(k, dest.get(k - 1));
                    k--;
                }
            }
            dest.set(insertIndex, next);
        }
    }

    public static void insertionSortByStudio(ArrayList<Movie> source, ArrayList<Movie> dest) {
        for (int i = 0; i < source.size(); i++) {
            Movie next = source.get(i);
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (next.getStudio().compareTo(dest.get(k - 1).getStudio()) > 0) {
                    insertIndex = k;
                } else {
                    dest.set(k, dest.get(k - 1));
                    k--;
                }
            }
            dest.set(insertIndex, next);
        }
    }

    public static void printAllMovie(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}