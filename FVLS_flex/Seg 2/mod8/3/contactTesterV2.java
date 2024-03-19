
/*
 * Purpose of Project: To listen family contacts and store them in a file
 * Version/Date: 3/10/2024
 * Author: Tejas Upadhyay
 */
public class contactTesterV2 {
    public static void main(String[] args) {

        Contacts[] contactArray = new Contacts[10];
        combineContactsIntoList(contactArray);
        // Print the sorted movies
        System.out.println("\nHere is your list: \n");
        printAllContact(contactArray);

        System.out.println("\nWhat do you want to search for?");
        System.out.println("1. Name");
        System.out.println("2. Relation");
        System.out.println("3. Birth Month");
        System.out.println("4. Phone Number");
        System.out.println("5. Email");
        System.out.println();

        for (int i = 0; i < 6; i++) {

            if (i == 1) {
                System.out.println("What name do you want to search for?");
                String Name = "Tony Stark";
                System.out.println(Name);
                sortByContactsName(contactArray);
                binarySearchByName(contactArray, Name);
                System.out.println();

            } else if (i == 2) {
                System.out.println("What relation do you want to search for?");
                String Relation = "Sister";
                System.out.println(Relation);
                sortByRelation(contactArray);
                binarySearchByRelation(contactArray, Relation);
                System.out.println();

            } else if (i == 3) {
                System.out.println("What birth month do you want to search for?");
                String month = "October";
                System.out.println(month);
                sequentialSearchByBirthday(contactArray, month);
                System.out.println();

            } else if (i == 4) {
                System.out.println("What phone number do you want to search for?");
                String PhoneNumber = "1234567890";
                System.out.println(PhoneNumber);
                sequentialSearchByPhoneNumber(contactArray, PhoneNumber);
                System.out.println();

            } else if (i == 5) {
                System.out.println("What email do you want to search for?");
                String Email = "peter@webs.com";
                System.out.println(Email);
                sequentialSearchByEmail(contactArray, Email);
                System.out.println();

            }
        }

    }

    public static void combineContactsIntoList(Contacts[] contactArray) {
        contactArray[0] = new Contacts("Diana Prince", "Mother", "January", 3, "1234567890",
                "wonderwoman@theamazon.net");
        contactArray[1] = new Contacts("Bruce Wayne", "Father", "February", 8, "9876543210", "batman@cave.com");
        contactArray[2] = new Contacts("Samus Aran", "Sister", "March", 4, "1029384756", "samus@metorid.net");
        contactArray[3] = new Contacts("Tony Stark", "Brother", "October", 10, "4087365291", "ironman@billion.com");
        contactArray[4] = new Contacts("Bruce Banner", "Uncle", "May", 5, "1928374650", "hulk@smash.com");
        contactArray[5] = new Contacts("Elon Musk", "Friend", "June", 2, "1357924680", "irl@billion.com");
        contactArray[6] = new Contacts("Mark Zuckerberg", "cousin", "July", 11, "9753186420", "zuck@meta.com");
        contactArray[7] = new Contacts("Bill Gates", "grandpa", "August", 6, "1122334455", "gates@windows");
        contactArray[8] = new Contacts("Peter Parker", "Friend", "September", 1, "636464820", "peter@webs.com");
        contactArray[9] = new Contacts("John Romero", "God Father", "October", 7, "1029384756", "john@doomslayer.com");

    }

    public static void sortByContactsName(Contacts[] ContactsArray) {
        int n = ContactsArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (ContactsArray[j].getName().compareTo(ContactsArray[min_idx].getName()) < -0)
                    min_idx = j;

            // Swap the found minimum element with the first
            Contacts temp = ContactsArray[min_idx];
            ContactsArray[min_idx] = ContactsArray[i];
            ContactsArray[i] = temp;
        }
    }

    public static void binarySearchByName(Contacts[] ContactsArray, String targetName) {
        int high = ContactsArray.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (ContactsArray[probe].getName().compareTo(targetName) > 0)
                high = probe;
            else {
                low = probe;
                if (ContactsArray[probe].getName().compareTo(targetName) == 0) {
                    break;
                }
            }
        }

        if ((low >= 0) && (ContactsArray[low].getName().compareTo(targetName) == 0)) {
            System.out.println("Found: " + ContactsArray[low].toString());
        } else
            System.out.println("NOT found: " + targetName);
    }

    public static void sortByRelation(Contacts[] contactArray) {
        int n = contactArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (contactArray[j].getRelation().compareTo(contactArray[min_idx].getRelation()) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            Contacts temp = contactArray[min_idx];
            contactArray[min_idx] = contactArray[i];
            contactArray[i] = temp;
        }
    }

    public static void binarySearchByRelation(Contacts[] contactArray, String targetRelation) {
        int high = contactArray.length;
        int low = -1;
        int probe;
        int foundCount = -1;
        Contacts[] foundContacts = new Contacts[contactArray.length];

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (contactArray[probe].getRelation().compareTo(targetRelation) > 0)
                high = probe;
            else {
                low = probe;
                if (contactArray[probe].getRelation().compareTo(targetRelation) == 0) {
                    foundCount++;
                    foundContacts[foundCount] = contactArray[probe];
                    // break;
                }
            }
        }

        if (foundCount == -1) {
            System.out.println("We did not find " + targetRelation + " in the list");
        } else {
            System.out.println("We found " + targetRelation + " in the list " + (foundCount + 1) + " times.");

            for (int i = 0; i < foundContacts.length; i++) {
                if (foundContacts[i] != null) {
                    System.out.println(foundContacts[i]);

                }
            }

        }
    }

    public static void sequentialSearchByBirthday(Contacts[] r, String toFind) {
        int found = -1;
        Contacts[] foundContacts = new Contacts[r.length];

        for (int i = 0; i < r.length; i++) {
            if (r[i].getBirthMonth().equalsIgnoreCase(toFind)) {
                found++;
                foundContacts[found] = r[i];
            }
        }

        if (found == -1) {
            System.out.println("We did not find " + toFind + " in the list");
        } else {
            System.out.println("We found " + toFind + " in the list " + (found + 1) + " times.");

            for (int i = 0; i < foundContacts.length; i++) {
                if (foundContacts[i] != null) {
                    System.out.println(foundContacts[i]);

                }
            }

        }
        // Print the sorted movies
    }

    public static void sequentialSearchByPhoneNumber(Contacts[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getPhoneNumber().equalsIgnoreCase(toFind)) {
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

    public static void sequentialSearchByEmail(Contacts[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getEmail().equalsIgnoreCase(toFind)) {
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

    public static void printAllContact(Contacts[] ContactsList) {
        for (Contacts contacts : ContactsList) {
            System.out.println(contacts.toString());
        }
    }
}
