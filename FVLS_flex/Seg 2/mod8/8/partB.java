import java.util.ArrayList;

public class partB {
    /**
     *
     * 
     * 
     * precondition: twoD is neither null nor empty
     *
     * 
     * 
     */

    public static ArrayList<Integer> oddNumbers(int[][] twoD) {
        ArrayList<Integer> oddList = new ArrayList<>();

        // Iterate through the 2D array and add odd numbers to the list
        for (int[] row : twoD) {
            for (int num : row) {
                if (num % 2 != 0) {
                    oddList.add(num);
                }
            }
        }

        return oddList;
    }
}
