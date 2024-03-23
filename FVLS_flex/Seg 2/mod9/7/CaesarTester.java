import java.util.Scanner;

public class CaesarTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please press a shift key value from 0-25");
        int input = in.nextInt();

        while (input < 0 || input > 25) {
            System.out.println("Please press a shift key value from 0-25");
            input = in.nextInt();
        }

        Encryption.setShiftValue(input);

        // System.out.println(Encryption.getAlphabet());
        // System.out.println(Encryption.generateCipherAlphabet());

        System.out.println("""

                Do you want to encrypt or decrypt?

                1 : Encrypt
                2 : Decrypt
                3 : Quit
                """);
        input = in.nextInt();
        while (input != 3) {
            String message;
            if (input == 1) {
                System.out.println("What message would you like to encrypt?");
                in.nextLine();
                message = in.nextLine();
                Encryption.encrypting(message);
            } else if (input == 2) {
                System.out.println("What message would you like to decrypt?");
                in.nextLine();
                message = in.nextLine();
                Decryption.decrypting(message);
            } else {
                break;
            }

            System.out.print("""
                    Do you want to encrypt or decrypt?

                    1 : Encrypt
                    2 : Decrypt
                    3 : Quit

                    """);

            // in.next();
            input = in.nextInt();

        }
    }
}
