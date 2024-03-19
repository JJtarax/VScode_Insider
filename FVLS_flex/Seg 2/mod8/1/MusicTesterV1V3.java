/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class MusicTesterV1V3 {
    public static void main(String[] args) {
        // Moive List
        MusicV3[] musicArray = new MusicV3[10];
        createSongIntoList(musicArray);

        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);

        System.out.println("\nWhat year do you want to search for?");
        System.out.println("1. Song title");
        System.out.println("2. Song year");
        System.out.println("3. Song artist");
        System.out.println();

        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                System.out.println("What song title do you want to search for?");
                String title = "Rasputin";
                System.out.println(title);
                sequentialSearchByTitle(musicArray, title);
                System.out.println();
            } else if (i == 2) {
                System.out.println("What year do you want to search for?");
                int year = 2009;
                System.out.println(year);
                sequentialSearchByYear(musicArray, year);
                System.out.println();
            } else if (i == 3) {
                System.out.println("What artist do you want to search for?");
                String artist = "Madcon";
                System.out.println(artist);
                sequentialSearchByArtist(musicArray, artist);
            }
        }

        // Print the sorted movies
        // System.out.println("\nHere is your list: \n");
        // printAllSong(musicArray);
    }

    public static void sequentialSearchByTitle(MusicV3[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getTitle().equalsIgnoreCase(toFind)) {
                found = i;
                System.out.println("We found " + toFind + " in the list");
                System.out.println(r[found]);
            }
        }

        if (found == -1) {
            System.out.println("We did not find " + toFind + " in the list");
        }

        // Print the sorted movies

    }

    public static void sequentialSearchByYear(MusicV3[] r, int toFind) {
        int found = 0;

        System.out.println("Finding results...");
        for (int i = 0; i < r.length; i++) {
            if (r[i].getYear() == toFind) {
                System.out.println(r[i]);
                found++;
            }
        }

        if (found == 0) { // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }

    public static void sequentialSearchByArtist(MusicV3[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getArtist().compareTo(toFind) == 0) {
                found = i;
                break; // terminates the for loop
            }
        }

        if (found != -1) { // we have found the person
            System.out.println("We found " + toFind + " in the list: ");
            System.out.println(r[found]);
        } else
            System.out.println(toFind + " is not in the list");
    }

    public static void createSongIntoList(MusicV3[] musicArray) {
        musicArray[0] = new MusicV3("Seven Nation Army", 2003, "The White Stripes");
        musicArray[1] = new MusicV3("Beggin'", 2007, "Madcon");
        musicArray[2] = new MusicV3("Alors on danse", 2009, "Stromae");
        musicArray[3] = new MusicV3("Paint it, Black", 1966, "The Rolling Stones");
        musicArray[4] = new MusicV3("Fairy Tale", 2009, "Alexander Rybak");
        musicArray[5] = new MusicV3("Rasputin", 1978, "Boney M.");
        musicArray[6] = new MusicV3("bad guy", 2019, "Billie Eilish");
        musicArray[7] = new MusicV3("Skyfall", 2012, "Adele");
        musicArray[8] = new MusicV3("Human", 2016, "Rag'n'Bone Man");
        musicArray[9] = new MusicV3("Careless Whisper", 1984, "George Michael");

    }

    public static void printAllSong(MusicV3[] musicList) {
        for (MusicV3 song : musicList) {
            System.out.println(song.toString());
        }
    }
}
