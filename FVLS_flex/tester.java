package FVLS_flex;

public class tester {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        int i = str.indexOf("o", 27);
        System.out.println(i);

        System.out.println("Before: " + str.substring(0, i - 1).length());
        System.out.println("After : " + str.substring(i + 1).length());
    }
}
