import java.util.ArrayList;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        // Moive list
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

        // asking the user in what order they want the moives organized in
        System.out.println("How would you like to organize the movies? (title/year/studio)");
        String choice = in.nextLine();
        in.close();

        // Sorting the movies
        if (choice.equalsIgnoreCase("title")) {
            movies.sort((m1, m2) -> m1.getTitle().compareTo(m2.getTitle())); // Sort by title
        } else if (choice.equalsIgnoreCase("year")) {
            movies.sort((m1, m2) -> m1.getYear() - m2.getYear()); // Sort by year
        } else if (choice.equalsIgnoreCase("studio")) {
            movies.sort((m1, m2) -> m1.getStudio().compareTo(m2.getStudio())); // Sort by studio
        }

        // Print the sorted movies
        System.out.println("Here is your list: ");
        printAllMovie(movies);

    }

    public static void printAllMovie(ArrayList<Movie> moives) {
        System.out.println(moives.toString());

    }
}