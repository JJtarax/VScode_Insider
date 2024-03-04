/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class MusicTester {
    public static void main(String[] args) {
        // Moive List
        String[] musicTitle = {
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
        int[] musicYear = {
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
        String[] musicArtist = {
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

        Music[] musicArray = combineSongIntoList(musicTitle, musicYear, musicArtist);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);
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
