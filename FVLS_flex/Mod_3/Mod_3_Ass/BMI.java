/* 
<18.5 underweight
18.5 - 24.9 normal
25.5 - 29.9 Overweight
>29.9 obese
*/

package FVLS_flex.Mod_3.Mod_3_Ass;

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String n = in.nextLine();

        System.out.println("What is your weight(pounds)? ");
        double w = in.nextDouble();

        System.out.println("What is your height(inches)? ");
        double h = in.nextDouble();


        System.out.println("----------------------------------");
        //name
        System.out.println("Name: "+n);
        //weight
        System.out.println("Weight: "+w);
        //height
        System.out.println("Height: "+h);
        //BMI
        int BMI = (int) (w/(h*h));
        System.out.println(BMI);
        //If or if not overweight
        if (BMI<=18.5) {
            System.out.println("You are under weight");
        }
        else if (BMI>24.9){
            System.out.println("You are normal");
        }


        in.close();
    }
    
}