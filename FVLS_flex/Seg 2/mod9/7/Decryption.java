public class Decryption {

    private static int shiftValue = -1;
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public Decryption() {

    }

    public static void setShiftValue(int value) {
        shiftValue = value;
    }

    public static String generateCipherAlphabet() {
        return alphabet.substring(shiftValue) + alphabet.substring(0, shiftValue);
    }

    public static String getAlphabet() {
        return alphabet;
    }

    public static void decrypting(String message) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            String r = message.substring(i, i + 1);

            String cipherbet = generateCipherAlphabet();

            String foundChar = alphabet.substring(cipherbet.indexOf(r), cipherbet.indexOf(r) + 1);

            if (r.equals(" ")) {
                decryptedMessage += " ";
            } else {
                decryptedMessage += foundChar;
            }
        }
        System.out.println(decryptedMessage);
    }
}