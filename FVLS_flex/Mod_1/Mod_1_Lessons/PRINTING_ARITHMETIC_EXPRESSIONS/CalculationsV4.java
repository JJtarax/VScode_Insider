package FVLS_flex.Mod_1.Mod_1_Lessons.PRINTING_ARITHMETIC_EXPRESSIONS;

public class CalculationsV4 {
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;

        double dNum1 = 43.21;
        double dNum2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2+ " = " + (dNum1 + dNum2));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum1 + " - " + iNum2 + " = " + (iNum1 - iNum2));
        System.out.println(dNum1 + " - " + dNum2+ " = " + (dNum1 - dNum2));
        System.out.println();

        //Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum1 + " * " + dNum2+ " = " + (dNum1 * dNum2));
        System.out.println();
        
        //Division
        System.out.println("Division");
        System.out.println(iNum1 + " / " + iNum2 + " = " + (iNum1 / iNum2));
        System.out.println(dNum1 + " / " + dNum2+ " = " + (dNum1 / dNum2));
        System.out.println();

        //Modulus
        System.out.println("Modulus");
        System.out.println(iNum1 + " % " + iNum2 + " = " + (iNum1 % iNum2));
        System.out.println(dNum1 + " % " + dNum2+ " = " + (dNum1 % dNum2));
        System.out.println();
    }
}