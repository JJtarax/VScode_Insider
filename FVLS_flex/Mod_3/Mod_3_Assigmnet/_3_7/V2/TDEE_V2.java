/*
 * Maker: Tejas Upadhyay
 * verison: 7-17-2023
 * Purpose: Tell you your TDEE
 */

package FVLS_flex.Mod_3.Mod_3_Assigmnet._3_7.V2;

import java.util.Scanner;

public class TDEE_V2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter you name: ");
        String Name = in.nextLine();

        System.out.println("Please enter your BMR: ");
        double BMR = in.nextDouble();

        System.out.println("Please enter your gender (M/F): ");
        String Gen = in.next().toUpperCase();

        if (!Gen.equals("M") && !Gen.equals("F")){
            System.out.println("Please enter a valid gender");
            in.close();
            return;
        }

        System.out.println("""
                Select Your Activty Level
                [A] Resting (Sleeping, Reclining)
                [B] Sedentary (Restricted Mobility)
                [C] Light (Sitting, Standing)
                [D] Moderate (Light manual Labor, Dancing, Riding Bike)
                [E] Very Active (Team Sports, Hard Manual Labor)
                [F] Extermely Active (Full-time Athlete, heavy Manual Labor)

                Enter the letter corresponding to your activity level:
                """);

        String AL = in.next().toUpperCase();
        
        double AF = 0; 
        double TDEE = 0;

        if (AL.equals("A") && Gen.equals("M") || AL.equals("A") && Gen.equals("F")){
            AF = 1.0;
        }
        else if (AL.equals("B") && Gen.equals("M") || AL.equals("B") && Gen.equals("F")){
            AF = 1.3;
        }

        else if (AL.equals("C") && Gen.equals("M")){
            AF = 1.6;
        }
        else if (AL.equals("C") && Gen.equals("F")){
            AF = 1.5;
        }

        else if (AL.equals("D") && Gen.equals("M")){
            AF = 1.7;
        }
        else if (AL.equals("D") && Gen.equals("F")){
            AF = 1.6;
        }

        else if (AL.equals("E") && Gen.equals("M")){
            AF = 2.1;
        }
        else if (AL.equals("E") && Gen.equals("F")){
            AF = 1.9;
        }
        
        else if (AL.equals("F") && Gen.equals("M")){
            AF = 2.4;
        }
        else if (AL.equals("F") && Gen.equals("F")){
            AF = 2.2;
        }

        else{
            System.out.println("Please enter a valid Activity Level");
            in.close();
            return;
        }
        
        TDEE = BMR * AF; // math to find the TDEE

        System.out.println("Your results:");
        System.out.print("Name: "+Name);
        System.out.println("\t\t\t\t Gender: "+Gen);
        System.out.print("BMR: "+BMR+" Calories");
        System.out.println("\t\t Activity Factor: "+AF);
        System.out.println("TDEE: "+TDEE+" Calories");

        in.close();
    }
}