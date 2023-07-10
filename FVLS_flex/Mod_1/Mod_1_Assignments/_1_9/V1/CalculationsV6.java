/**
 * The code here is hard-coded instead of asking the user for the values
 * @author Tejas Upadhyay
 * @ made: 6/262023
*/
package FVLS_flex.Mod_1.Mod_1_Assignments._1_9.V1;

public class CalculationsV6 {
    public static void main(String[] args) {

        // ****************************************************************
        System.out.println("Hard-Coded Version");
        // ****************************************************************
        
        //Addition
        System.out.println("Addition");
        System.out.println("25 + 9 = 34");
        System.out.println("43.21 + 3.14 = 46.35\n");

        //Subtraction
        System.out.println("Subtraction");
        System.out.println("25 - 9 = 16");
        System.out.println("43.21 - 3.14 = 40.07\n");

        //Multiplication
        System.out.println("Multiplication");
        System.out.println("25 * 9 = 225");
        System.out.println("43.21 * 3.14 = 135.67940000000002\n");

        //Division
        System.out.println("Division");
        System.out.println("25 / 9 = 2");
        System.out.println("43.21 / 3.14 = 13.761146496815286\n");

        //Modulus
        System.out.println("Modulus");
        System.out.println("25 % 9 = 7");
        System.out.println("43.21 % 3.14 = 2.3899999999999992\n");



        // ****************************************************************
        System.out.println("Non-Hard-Coded Version");
        // ****************************************************************

        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;

        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();            
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum1 + " - " + iNum2 + " = " + (iNum1 - iNum2));
        System.out.println(dNum1 + " - " + dNum2 + " = " + (dNum1 - dNum2));
        System.out.println();

        //Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum1 + " * " + dNum2 + " = " + (dNum1 * dNum2));
        System.out.println();

        //Division
        System.out.println("Division");
        System.out.println(iNum1 + " / " + iNum2 + " = " + (iNum1 / iNum2));
        System.out.println(dNum1 + " / " + dNum2 + " = " + (dNum1 / dNum2));
        System.out.println();

        //Modulus
        System.out.println("Modulus");
        System.out.println(iNum1 + " % " + iNum2 + " = " + (iNum1 % iNum2));
        System.out.println(dNum1 + " % " + dNum2 + " = " + (dNum1 % dNum2));
        System.out.println();
    }
}