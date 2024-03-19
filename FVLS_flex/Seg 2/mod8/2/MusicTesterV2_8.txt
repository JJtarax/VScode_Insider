
/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */

public class MusicTesterV2_8 {

    public static void main(String[] args) {
        // Moive List
        Music[] musicArray = new Music[10];
        createSongIntoList(musicArray);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);

        System.out.println("\nWhat are you searching for?");
        System.out.println("1. Year");
        System.out.println("2. Title");
        System.out.println("3. Artist");

        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                System.out.println("What year are you looking for?");
                int year = 2009;
                System.out.println(year);
                sortByMusicYear(musicArray);
                binarySearchByYear(musicArray, year);
            } else if (i == 2) {
                System.out.println("What title are you looking for?");
                String title = "Beggin'";
                System.out.println(title);
                sortByMusicTitle(musicArray);
                binarySearchByTitle(musicArray, title);
            } else if (i == 3) {
                System.out.println("What artist are you looking for?");
                String artist = "Madcon";
                System.out.println(artist);
                sortByMusicArtist(musicArray);
                binarySearchByArtist(musicArray, artist);
            }
        }

    }

    public static void sortByMusicYear(Music[] musicArray) {
        int n = musicArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (musicArray[j].getYear() < musicArray[min_idx].getYear())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Music temp = musicArray[min_idx];
            musicArray[min_idx] = musicArray[i];
            musicArray[i] = temp;
        }
    }

    public static void sortByMusicTitle(Music[] musicArray) {
        int n = musicArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (musicArray[j].getTitle().compareTo(musicArray[min_idx].getTitle()) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Music temp = musicArray[min_idx];
            musicArray[min_idx] = musicArray[i];
            musicArray[i] = temp;
        }

    }

    public static void sortByMusicArtist(Music[] musicArray) {
        int n = musicArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (musicArray[j].getArtist().compareTo(musicArray[min_idx].getArtist()) < -0)
                    min_idx = j;

            // Swap the found minimum element with the first
            Music temp = musicArray[min_idx];
            musicArray[min_idx] = musicArray[i];
            musicArray[i] = temp;
        }
    }

    public static void binarySearchByYear(Music[] musicArray, int targetYear) {
        int high = musicArray.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (musicArray[probe].getYear() > targetYear)
                high = probe;
            else {
                low = probe;
                if (musicArray[probe].getYear() == targetYear) {
                    break;
                }
            }
        }

        if ((low >= 0) && (musicArray[low].getYear() == targetYear)) {
            System.out.println("Found: " + musicArray[low].toString());
        } else
            System.out.println("NOT found: " + targetYear);
    }

    public static void binarySearchByTitle(Music[] musicArray, String targetTitle) {
        int high = musicArray.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (musicArray[probe].getTitle().compareTo(targetTitle) > 0)
                high = probe;
            else {
                low = probe;
                if (musicArray[probe].getTitle().compareTo(targetTitle) == 0) {
                    break;
                }
            }
        }

        if ((low >= 0) && (musicArray[low].getTitle().compareTo(targetTitle) == 0)) {
            System.out.println("Found: " + musicArray[low].toString());
        } else
            System.out.println("NOT found: " + targetTitle);
    }

    public static void binarySearchByArtist(Music[] musicArray, String targetArtist) {
        int high = musicArray.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (musicArray[probe].getArtist().compareTo(targetArtist) > 0)
                high = probe;
            else {
                low = probe;
                if (musicArray[probe].getArtist().compareTo(targetArtist) == 0) {
                    break;
                }
            }
        }

        if ((low >= 0) && (musicArray[low].getArtist().compareTo(targetArtist) == 0)) {
            System.out.println("Found: " + musicArray[low].toString());
        } else
            System.out.println("NOT found: " + targetArtist);
    }

    public static void createSongIntoList(Music[] musicArray) {
        musicArray[0] = new Music("Seven Nation Army", 2003, "The White Stripes");
        musicArray[1] = new Music("Beggin'", 2007, "Madcon");
        musicArray[2] = new Music("Alors on danse", 2009, "Stromae");
        musicArray[3] = new Music("Paint it, Black", 1966, "The Rolling Stones");
        musicArray[4] = new Music("Fairy Tale", 2009, "Alexander Rybak");
        musicArray[5] = new Music("Rasputin", 1978, "Boney M.");
        musicArray[6] = new Music("bad guy", 2019, "Billie Eilish");
        musicArray[7] = new Music("Skyfall", 2012, "Adele");
        musicArray[8] = new Music("Human", 2016, "Rag'n'Bone Man");
        musicArray[9] = new Music("Careless Whisper", 1984, "George Michael");

    }

    public static void printAllSong(Music[] musicList) {
        for (Music song : musicList) {
            System.out.println(song.toString());
        }
    }
}
