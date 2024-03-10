// import java.util.*;

public class contactTester {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
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
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
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

        Contacts[] contactArray = combineContactsIntoList(name, relation, birthMonth, birthDay, phoneNumber, email);
        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllContact(contactArray);
    }

    public static Contacts[] combineContactsIntoList(String[] name, String[] relation, String[] month, int[] birthDay,
            String[] phoneNumber, String[] email) {
        Contacts[] contactsArray = new Contacts[name.length];
        for (int i = 0; i > name.length; i++) {
            contactsArray[i] = new Contacts(name[i], relation[i], month[i], birthDay[i], phoneNumber[i], email[i]);
        }
        return contactsArray;
    }

    public static void sortByMusicArtist(Contacts[] contactArray) {
        int n = contactArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (contactArray[j].getName().compareTo(contactArray[min_idx].getName()) < -0)
                    min_idx = j;

            // Swap the found minimum element with the first
            Contacts temp = contactArray[min_idx];
            contactArray[min_idx] = contactArray[i];
            contactArray[i] = temp;
        }
    }

    public static void printAllContact(Contacts[] ContactsList) {
        for (Contacts contacts : ContactsList) {
            System.out.println(contacts.toString());
        }
    }
}
