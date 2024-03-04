/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class MusicTesterV2 {
    public static void main(String[] args) {
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
                "Gloria Gaynor",
        };

        Music[] musicArray = combineSongIntoList(musicTitle, musicYear, musicArtist);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);
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
