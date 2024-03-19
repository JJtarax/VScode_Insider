/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */
public class testerVV2 {
    public static void main(String[] args) {
        // Moive List
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
        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllMovie(movieList);
    }

    public static void printAllMovie(ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}
