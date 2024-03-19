/**
 * Purpose: To list the movies that are saved inside of an arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

public class testerV2V2 {
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
        printAllMovie(movieList);
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
        insertionSortByStudio(movieList, 2);
        printAllMovie(movieList);
    }

    public static void insertionSortByYear(ArrayList<Movie> source, int order) {
        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getYear() > key.getYear()) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        } else {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getYear() < key.getYear()) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        }
    }

    public static void insertionSortByTitle(ArrayList<Movie> source, int order) {

        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getTitle().compareTo(key.getTitle()) > 0) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        } else {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getTitle().compareTo(key.getTitle()) < 0) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        }
    }

    public static void insertionSortByStudio(ArrayList<Movie> source, int order) {
        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getStudio().compareTo(key.getStudio()) > 0) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        } else {
            for (i = 1; i < source.size(); i++) {
                key = source.get(i);
                j = i - 1;

                while (j >= 0 && source.get(j).getStudio().compareTo(key.getStudio()) < 0) {
                    source.set(j + 1, source.get(j));
                    j--;
                }
                source.set(j + 1, key);
            }
        }
    }

    public static void printAllMovie(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}