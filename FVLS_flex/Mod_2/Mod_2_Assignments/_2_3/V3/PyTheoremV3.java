/**
 * The code here is hard-coded instead of asking the user for the values
 * @author Tejas Upadhyay
 * @ made: 7/10/2023
*/
package FVLS_flex.Mod_2.Mod_2_Assignments._2_3.V3;

//import java.util.Random;

public class PyTheoremV3 {
    public static void main(String[] args) {
        // Triangle 1
        double x = Math.random(); // Value of side A/x
        double sideA = Math.pow(x, 2); // x^2
        double y = Math.random(); // Value of B/y
        double sideB = Math.pow(y, 2); // y^2
        double p = sideA + sideA; // Added (x^2)+(y^2)
        double h = Math.sqrt(p); // √p = √(x^2)+(y^2)
        System.out.println("Triangle 1 \tSide 1 : "+ x +" \tSide 2 :" + y + "\tHypotenuse : " + h); // output

        // Triangle 2
        x = Math.random(); // Value of side A/x
        sideA = Math.pow(x, 2); // x^2
        y = Math.random(); // Value of B/y
        sideB = Math.pow(y, 2); // y^2
        p = sideA + sideB; // Added (x^2)+(y^2)
        h = Math.sqrt(p); // √p = √(x^2)+(y^2)
        System.out.println("Triangle 2 \tSide 1 : "+ x +" \tSide 2 :" + y + "\tHypotenuse : " + h); // output
    }
}
