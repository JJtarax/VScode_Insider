
/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class MusicTesterV3 {
    public static void main(String[] args) {
        // Moive List
        MusicV3[] musicArray = new MusicV3[10];
        createSongIntoList(musicArray);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllSong(musicArray);
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
