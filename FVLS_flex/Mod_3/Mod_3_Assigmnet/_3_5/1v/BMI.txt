/* 
Author: Tejas Upahdyay
Verison/date: 7-19-2023
Pupose: Tell user there BMI
*/

package FVLS_flex.Mod_3.Mod_3_Assigmnet._3_5;

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String n = in.nextLine();

        System.out.println("What is your weight(pounds)? ");
        double wp = in.nextDouble();
        double w = wp*0.45359237;

        System.out.println("What is your height(Feet and Inches (put space between the feet and the inches))? ");
        float hf = in.nextInt();
        float hi = in.nextFloat();
        double h = ((hf*12)+hi)*0.0254;


        System.out.println("----------------------------------");
        //name
        System.out.println("Name: "+n);
        //weight
        System.out.println("Weight (kg): "+w);
        //height
        System.out.println("Height (m): "+h);
        //BMI
        int BMI = (int) (w/(h*h));
        System.out.println(BMI);
        //If or if not overweight
        if (BMI<=18.5) {
            System.out.println("You are under weight");
        }
        else if (BMI<=25.5){
            System.out.println("You are normal");
        }
        else if (BMI<=29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("You are obese");
        }

        in.close();
    }
    
}