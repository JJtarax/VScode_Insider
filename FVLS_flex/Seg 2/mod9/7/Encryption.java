public class Encryption {

    private static int shiftValue = -1;
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public Encryption() {

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

    public static void encrypting(String message) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            String r = message.substring(i, i + 1);

            String cipherbet = generateCipherAlphabet();

            String foundChar = cipherbet.substring(alphabet.indexOf(r), alphabet.indexOf(r) + 1);

            if (r.equals(" ")) {
                encryptedMessage += " ";
            } else {
                encryptedMessage += foundChar;
            }
        }
        System.out.print(encryptedMessage);
    }
}
