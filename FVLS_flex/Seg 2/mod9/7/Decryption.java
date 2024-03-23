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

    public static void decrypting(String w) {
        String x = "";
        for (int i = 0; i < w.length(); i++) {
            String r = w.substring(i, i + 1);

            for (int j = 0; j < alphabet.length(); j++) {
                Boolean p = r.equalsIgnoreCase(generateCipherAlphabet().substring(j, j + 1));
                if (r.equals(" ")) {
                    break;
                }
                if (p) {
                    x += alphabet.substring(j, j + 1);
                    break;
                }
            }
            if (r.equals(" ")) {
                x += " ";
            } else if (r.equals("")) {
            }
            System.out.print(x);
        }
    }
}
