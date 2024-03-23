package FVLS_flex;

public class tester {
    public static void encrypting(String w) {
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            System.out.println(c);
        }
    }

    // Example usage:
    public static void main(String[] args) {
        String input = "Hi there";
        encrypting(input);
    }

}