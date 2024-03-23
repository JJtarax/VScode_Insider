
// Project Title: Part A & Part B
// Purpose of Project:To make a 2d array that has numbers and another file that will find all the odd number within the 2d array and add those numbers into a arrayList
// Version/Date: 3/19/2024
// Author: Tejas Upadhyay
import java.util.ArrayList;

public class partBV2 {
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

        for (int i = twoD[0].length - 2; i >= 0; i--) {
            int[] row = twoD[i];
            for (int num : row) {
                if (num % 2 != 0) {
                    oddList.add(num);
                }
            }
        }

        return oddList;
    }
}
