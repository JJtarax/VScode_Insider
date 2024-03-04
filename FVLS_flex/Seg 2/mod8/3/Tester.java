import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = {
                "Diana Prince",
                "Bruce Wayne",
                "Samus Aran",
                "Tony Stark",
                "Bruce Banner",
                "Elon Musk",
                "Mark Zuckerberg",
                "Bill Gates",
                "Peter Parker",
                "John Romero",
                "John Kratos"
        };
        String[] relation = {
                "Mother",
                "Father",
                "Sister",
                "Brother",
                "Uncle",
                "Friend",
                "cousin",
                "grandpa",
                "Friend",
                "God Father",
                "Baby Sitter"
        };
        String[] birthMonth = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
        };
        int[] birthDay = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        String[] phoneNumber = {
                "1234567890",
                "9876543210",
                "1029384756",
                "4087365291",
                "1928374650",
                "1357924680",
                "9753186420",
                "1122334455",
                "636464820",
                "1029384756",
        };
        String[] email = {
                "wonderwoman@theamazon.net",
                "batman@cave.com",
                "samus@metorid.net",
                "ironman@billion.com",
                "hulk@smash.com",
                "irl@billion.com",
                "zuck@meta.com",
                "gates@windows",
                "peter@webs.com",
                "john@doomslayer.com",
                "kratos@gods.net"
        };

        Contacts[] contactArray = Contacts(name, relation, birthMonth, birthDay, phoneNumber, email);

        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllSong(contactsArray);
    }

    public static void sortByContactsYear(Contacts[] ContactsArray) {
        int n = ContactsArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (ContactsArray[j].getYear() < ContactsArray[min_idx].getYear())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Contacts temp = ContactsArray[min_idx];
            ContactsArray[min_idx] = ContactsArray[i];
            ContactsArray[i] = temp;
        }
    }

    public static void sortByContactsTitle(Contacts[] ContactsArray) {
        int n = ContactsArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (ContactsArray[j].getTitle().compareTo(ContactsArray[min_idx].getTitle()) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Contacts temp = ContactsArray[min_idx];
            ContactsArray[min_idx] = ContactsArray[i];
            ContactsArray[i] = temp;
        }

    }

    public static void sortByContactsArtist(Contacts[] ContactsArray) {
        int n = ContactsArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (ContactsArray[j].getArtist().compareTo(ContactsArray[min_idx].getArtist()) < -0)
                    min_idx = j;

            // Swap the found minimum element with the first
            Contacts temp = ContactsArray[min_idx];
            ContactsArray[min_idx] = ContactsArray[i];
            ContactsArray[i] = temp;
        }
    }

    public static void binarySearchByYear(Contacts[] ContactsArray, int targetYear) {

    }

    public static Contacts[] combineSongIntoList(String[] ContactsTitle, int[] ContactsYear, String[] ContactsArtist) {
        Contacts[] ContactsList = new Contacts[ContactsTitle.length];
        for (int i = 0; i < ContactsTitle.length; i++) {
            Contacts currentSong = new Contacts(ContactsTitle[i], ContactsYear[i], ContactsArtist[i]);
            ContactsList[i] = currentSong;
        }
        return ContactsList;
    }

    public static void printAllSong(Contacts[] ContactsList) {
        for (Contacts song : ContactsList) {
            System.out.println(song.toString());
        }
    }
}
