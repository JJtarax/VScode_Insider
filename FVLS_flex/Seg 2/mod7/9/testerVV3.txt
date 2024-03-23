/**
 * Purpose: To list the moives that are saved inside of a arrayList
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */
public class testerVV3 {
    public static void main(String[] args) {
        // Moive List
        Movie[] movieList = new Movie[10];
        createMoivesIntoList(movieList);
        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllMovie(movieList);
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
