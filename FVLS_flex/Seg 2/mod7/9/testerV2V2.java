import java.util.ArrayList;

/**
 * Purpose: To list the movies that are saved inside of an arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

public class testerV2V2 {
    public static void main(String[] args) {
        Movie[] movieList = new Movie[10];
        createMoivesIntoList(movieList);

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

    public static void insertionSortByYear(Movie[] movieList, int order) {
        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getYear() > key.getYear()) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        } else {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getYear() < key.getYear()) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        }
    }

    public static void insertionSortByTitle(Movie[] movieList, int order) {

        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getTitle().compareTo(key.getTitle()) > 0) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        } else {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getTitle().compareTo(key.getTitle()) < 0) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        }
    }

    public static void insertionSortByStudio(Movie[] movieList, int order) {
        int i, j;
        Movie key;
        if (order == 1) {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getStudio().compareTo(key.getStudio()) > 0) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        } else {
            for (i = 1; i < movieList.size(); i++) {
                key = movieList.get(i);
                j = i - 1;

                while (j >= 0 && movieList.get(j).getStudio().compareTo(key.getStudio()) < 0) {
                    movieList.set(j + 1, movieList.get(j));
                    j--;
                }
                movieList.set(j + 1, key);
            }
        }
    }

    public static void createMoivesIntoList(Movie[] movieList) {
        movieList[0] = new Movie("Seven Nation Army", 2003, "The White Stripes");
        movieList[1] = new Movie("Beggin'", 2007, "Madcon");
        movieList[2] = new Movie("Alors on danse", 2009, "Stromae");
        movieList[3] = new Movie("Paint it, Black", 1966, "The Rolling Stones");
        movieList[4] = new Movie("Fairy Tale", 2009, "Alexander Rybak");
        movieList[5] = new Movie("Rasputin", 1978, "Boney M.");
        movieList[6] = new Movie("bad guy", 2019, "Billie Eilish");
        movieList[7] = new Movie("Skyfall", 2012, "Adele");
        movieList[8] = new Movie("Human", 2016, "Rag'n'Bone Man");
        movieList[9] = new Movie("Careless Whisper", 1984, "George Michael");

    }

    public static void printAllMovie(Movie[] movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}