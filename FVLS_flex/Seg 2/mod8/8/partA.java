public class partA {
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
        // Create a 2D array with dimensions specified by rowH and colH
        int numRows = rowH.length;
        int numCols = colH.length;
        int[][] result = new int[numRows][numCols];

        // Fill the array with some placeholder values (you can modify this part)
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // Example: Fill with the product of rowH[i] and colH[j]
                result[i][j] = rowH[i] * colH[j];
            }
        }

        return result;
    }
}