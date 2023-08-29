package FVLS_flex.Mod_4.Mod_4_Assigment._4_6;

/**
 * Randomly generate passwords.
 *
 * @author APCS Team
 * @version FLVS 2021
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class wasd {
    public static void main(String[] args) throws IOException {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0;
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("wasd.txt"));

        System.out.println("**********************************************************");
        System.out.println(
                "Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // the user wants to continue
        while (userChoice.equals("Y") || userChoice.equals("y")) {
            // Ask for password length
            System.out.print("Enter a password length (6 or more): ");
            pwLength = in.nextInt();

            // validate password length
            if (pwLength < 6) {
                System.out.println("\tpassword length too short. Please try again.");
            } else {
                // generate a random character in the correct character set

                for (int ForpwLength = 0; ForpwLength < pwLength; ForpwLength++) {
                    randNum = (int) (Math.random() * (4 - 1) + 1);
                    if (randNum == 1) {
                        randNum = (int) (Math.random() * (90 - 65) + 65);
                    } else if (randNum == 2) {
                        randNum = (int) (Math.random() * (112 - 97) + 97);
                    } else if (randNum == 3) {
                        randNum = (int) (Math.random() * (57 - 48) + 48);
                    }
                    password += (char) (randNum);
                }
                // concatenate the character to the password

                // write the password to the file
                outFile.println(password);
                // when the user is done, close the text file so that it can be re-opened and
                // read
                System.out.println();
                System.out.println("A password has been written to the text file");
                System.out.print("Would you like to generate another password? (Y/N) ");
                userChoice = in.next();
            }
        } // end of while loop

        // Read passwords back from text file and display to the screen
        outFile.close();
        in.close();
        String token = "";
        File fileName = new File("wasd.txt");
        Scanner inFile = new Scanner(fileName);

        System.out.print("""

                Thank you for using the Pass Code Generator

                Here are your randomly generated codes:
                """);
        int lineNum = 1;
        // while loop will continue while inFile has a next token to read
        while (inFile.hasNext()) {
            token = inFile.next(); // read next token from file
            System.out.println(lineNum++ + ".\t" + token); // print value of token
        } // end while

        inFile.close(); // close input file
    }// end main
}// end class
