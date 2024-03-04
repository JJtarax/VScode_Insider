
/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

public class testerV3V2 {
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
        System.out.println("Here is your list");
        System.out.println("\nHere is your list sorted by title in descending order:\n");
        sortByMovieTitle(movieArray, 1);
        printAllMovie(movieArray);

        System.out.println("\nHere is your list sorted by title in ascending order:\n");
        sortByMovieTitle(movieArray, 2);
        printAllMovie(movieArray);

        System.out.println("\nHere is your list sorted by year in descending order:\n");
        sortByMovieYear(movieArray, 1);
        printAllMovie(movieArray);

        System.out.println("\nHere is your list sorted by year in ascending order:\n");
        sortByMovieYear(movieArray, 2);
        printAllMovie(movieArray);

        System.out.println("\nHere is your list sorted by studio in descending order:\n");
        sortByMovieStudio(movieArray, 1);
        printAllMovie(movieArray);

        System.out.println("\nHere is your list sorted by studio in ascending order:\n");
        sortByMovieStudio(movieArray, 2);
        printAllMovie(movieArray);
    }

    public static void sortByMovieYear(Movie[] movieArray, int order) {
        if (order == 1) {

            int n = movieArray.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getYear() < movieArray[min_idx].getYear())
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        } else if (order == 2) {
            int n = movieArray.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getYear() > movieArray[min_idx].getYear())
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        }
    }

    public static void sortByMovieTitle(Movie[] movieArray, int order) {
        if (order == 1) {
            int n = movieArray.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getTitle().compareTo(movieArray[min_idx].getTitle()) < 0)
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        } else if (order == 2) {
            int n = movieArray.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getTitle().compareTo(movieArray[min_idx].getTitle()) > 0)
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        }

    }

    public static void sortByMovieStudio(Movie[] movieArray, int order) {
        if (order == 1) {
            int n = movieArray.length;
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getStudio().compareTo(movieArray[min_idx].getStudio()) < -0)
                        min_idx = j;

                // Swap the found minimum element with the first
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        } else if (order == 2) {
            int n = movieArray.length;
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (movieArray[j].getStudio().compareTo(movieArray[min_idx].getStudio()) < -0)
                        min_idx = j;

                // Swap the found minimum element with the first
                Movie temp = movieArray[min_idx];
                movieArray[min_idx] = movieArray[i];
                movieArray[i] = temp;
            }
        }
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
