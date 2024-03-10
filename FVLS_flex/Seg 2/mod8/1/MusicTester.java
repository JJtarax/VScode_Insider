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
