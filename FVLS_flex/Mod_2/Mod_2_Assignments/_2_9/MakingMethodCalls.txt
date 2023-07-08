package FVLS_flex.Mod_2.Mod_2_Assignments._2_9;
/**
 * Without modifying any of the method signatures, correct add method calls to the already created methods in the main() below 
 *
 * APCS Team 2020 (Edited by: )
 *
 */ 
public class MakingMethodCalls {
    public static void addTheseTwo() {
        System.out.println("Ten plus five equals " + (10 + 5));
    }

    public static void multiplyTheseTwo(int a, int b) {
        System.out.println("Ten times five equals " + (a * b));
    }

    public static int divideTheseTwo(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {
        int x = 0b10;
        int y = 5;

        MakingMethodCalls.addTheseTwo();

        System.out.println();

        MakingMethodCalls.multiplyTheseTwo(x, y);

        System.out.println();

        int result = MakingMethodCalls.divideTheseTwo(x, y);
        System.out.println("Ten divided by five equals " + result);
    }
}

