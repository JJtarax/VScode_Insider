// Project Title: Part A & Part B
// Purpose of Project: To make a 2d array that has numbers and another file that will find all the odd number within the 2d array and add those numbers into a arrayList
// Version/Date: 3/19/2024
// Author: Tejas Upadhyay

import java.util.ArrayList;

public class partAV2 {
    /**
     *
     * 
     * 
     * precondition: rowH and colH each contain at least two values > 0
     *
     * 
     * 
     */

    public static int[][] calcMagicMath(int[] rowH, int[] colH) {

        int numRows = rowH.length;
        int numCols = colH.length + 1;
        int[][] result = new int[numRows][numCols];

        int randomNum = (int) (Math.random() * (31 - 3)) + 3;

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                if (i < numCols - 1)
                    result[j][i] = rowH[j] * colH[i];
                else
                    result[j][i] = rowH[j] * randomNum;
            }
        }

        return result;
    }
}