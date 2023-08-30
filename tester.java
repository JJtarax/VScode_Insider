public class tester {
    public static void main(String[] args) {

        int x = 1;
        int y = 0;

        System.out.println(!(x != 0 || y != 0)); // Original expression
        System.out.println(!(x != 0) && !(y != 0)); // Simplified expression using De Morgan's law

    }

}