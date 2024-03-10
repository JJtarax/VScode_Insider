import java.util.*;

/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class MusicTesterV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Moive List
        String[] musicTitle = {
                "Seven Nation Army",
                "Beggin'",
                "Alors on danse",
                "Paint it, Black",
                "Fairy Tale",
                "Rasputin",
                "bad guy",
                "Skyfall",
                "Human",
                "Careless Whisper",
                "I Will Survive"
        };
        int[] musicYear = {
                2003,
                2007,
                2009,
                1966,
                2009,
                1978,
                2019,
                2012,
                2016,
                1984,
                1978
        };
        String[] musicArtist = {
                "The White Stripes",
                "Madcon",
                "Stromae",
                "The Rolling Stones",
                "Alexander Rybak",
                "Boney M.",
                "Billie Eilish",
                "Adele",
                "Rag'n'Bone Man",
                "George Michael",
                "Gloria Gaynor"
        };

        Music[] musicArray = combineSongIntoList(musicTitle, musicYear, musicArtist);

        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);

        System.out.println("\nWhat year do you want to search for?");
        System.out.println("1. Song title");
        System.out.println("2. Song year");
        System.out.println("3. Song artist");
        int search = in.nextInt();
        if (search == 1) {
            System.out.println("What song title do you want to search for?");
            String title = in.next();
            sequentialSearchByTitle(musicArray, title);
        } else if (search == 2) {
            System.out.println("What year do you want to search for?");
            int year = in.nextInt();
            sequentialSearchByYear(musicArray, year);
        } else if (search == 3) {
            System.out.println("What artist do you want to search for?");
            String artist = in.next();
            sequentialSearchByArtist(musicArray, artist);
        }

        // Print the sorted movies
        // System.out.println("\nHere is your list: \n");
        // printAllSong(musicArray);
        in.close();
    }

    public static void sequentialSearchByTitle(Music[] r, String toFind) {
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

    public static void sequentialSearchByYear(Music[] r, int toFind) {
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

    public static void sequentialSearchByArtist(Music[] r, String toFind) {
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

    public static Music[] combineSongIntoList(String[] musicTitle, int[] musicYear, String[] musicArtist) {
        Music[] musicList = new Music[musicTitle.length];
        for (int i = 0; i < musicTitle.length; i++) {
            Music currentSong = new Music(musicTitle[i], musicYear[i], musicArtist[i]);
            musicList[i] = currentSong;
        }
        return musicList;
    }

    public static void printAllSong(Music[] musicList) {
        for (Music song : musicList) {
            System.out.println(song.toString());
        }
    }
}
