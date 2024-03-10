package FVLS_flex;

public class tester {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int out = 0; out < array.length; out++) {
            for (int in = 0; in < array[0].length; in++) {
                System.out.println(array[out][in++]);
            }
        }
    }
}
