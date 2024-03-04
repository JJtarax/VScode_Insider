
/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */
public class tester {
    public static void main(String[] args) {
        // Moive List
        String[] moivesName = {
                "Mean Girls",
                "The Matrix",
                "The Grinch",
                "Avengers: Endgame",
                "The Dark Knight",
                "Meet the Robinsons",
                "Transformers",
                "Bumblebee",
                "Oppenheimer",
                "Wonka" };
        int[] moivesYear = {
                2024,
                1999,
                2018,
                2019,
                2008,
                2007,
                2007,
                2018,
                2023,
                2023 };
        String[] moivesCompany = {
                "Paramount Pictures",
                "Warner Bros. Pictures",
                "Universal Pictures",
                "Marvel Studios",
                "Warner Bros. Pictures",
                "Disney",
                "Paramount Pictures",
                "Paramount Pictures",
                "Univeral Pictures",
                "Warner Bros. Pictures"
        };

        Movie[] movieArray = combineMovieIntoList(moivesName, moivesYear, moivesCompany);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllMovie(movieArray);
    }

    public static Movie[] combineMovieIntoList(String[] moivesName, int[] moivesYear, String[] moivesCompany) {
        Movie[] moivesList = new Movie[moivesName.length];
        for (int i = 0; i < moivesName.length; i++) {
            Movie currentMovie = new Movie(moivesName[i], moivesYear[i], moivesCompany[i]);
            moivesList[i] = currentMovie;
        }
        return moivesList;
    }

    public static void printAllMovie(Movie[] moivesList) {
        for (Movie movie : moivesList) {
            System.out.println(movie.toString());
        }
    }
}
