/**
 * This program randomly chooses numbers to plug into the pythoem forumla and prints the sides values and the hypotenuse
 * @author Tejas Upadhyay
 * @ made: 7/19/2022
*/
package FVLS_flex.Mod_2.Mod_2_Assignments._2_3.V3;

public class PyTheoremV4 {
    public static void main(String[] args) {
        // Triangle 1
        int x = (int) (Math.random() *(22-5+1) + 5); // Value of side A/x
        double sideA = Math.pow(x, 2); // x²
        int y = (int) (Math.random() *(22-5+1) + 5); // Value of B/y
        double sideB = Math.pow(y, 2); // y²
        double p = sideA + sideA; // Added (x²)+(y²)
        double h = Math.sqrt(p); // √p = √(x²)+(y²)
        System.out.println("Triangle 1 \tSide 1 : "+ x +" \tSide 2 : " + y + "\tHypotenuse : " + h); // output

        // Triangle 2
        x = (int) (Math.random() *(22-5+1) + 5); // Value of side A/x
        sideA = Math.pow(x, 2); // x^2
        y = (int) (Math.random() *(22-5+1) + 5); // Value of B/y
        sideB = Math.pow(y, 2); // y²
        p = sideA + sideB; // Added (x²)+(y²)
        h = Math.sqrt(p); // √p = √(x²)+(y²)
        System.out.println("Triangle 2 \tSide 1 : "+ x +" \tSide 2 : " + y + "\tHypotenuse : " + h); // output
    }
}
