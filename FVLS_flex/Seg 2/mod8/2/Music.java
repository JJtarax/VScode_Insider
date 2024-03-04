
/**
 * Purpose:
 *
 * @author Tejas Upadhyay
 * @version 3/1/2024
 *
 */
public class Music {
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public Music(String t, int y, String a) {
        // initialize instance variables
        title = t;
        year = y;
        artist = a;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String toString() {
        String str = String.format("%-25s %4d   %-20s ", title, year, artist);
        return str;
    }
}
