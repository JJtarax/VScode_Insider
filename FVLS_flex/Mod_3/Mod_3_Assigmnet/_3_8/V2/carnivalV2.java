/*
 * Auhtor : Tejas Upadhyay
 * Date : 08/16/2023
 */

package FVLS_flex.Mod_3.Mod_3_Assigmnet._3_8.V2;

import java.util.Scanner;

public class carnivalV2 {

    public static void printTicket (String name, String id, double price) {

        System.out.println("Welcome to the APCS Carnvial, "+name+"!");
        System.out.println("Your user ID is "+id);
        System.out.println("The cost of your ticket is $"+price);
        System.out.println("Have a great time at APCS carnival today!");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name (First name and last name)?");
        String name = in.nextLine();
        char firstNameInitial = name.charAt(0);
        String lastName = name.substring(name.indexOf(" "), name.length());
        int IDNumber = (int)(Math.random()*(1000-0)+0);
        String id = firstNameInitial+lastName+IDNumber;

        System.out.println("What is your age?");
        short age = in.nextShort();

        double price = 0;
        if (age<3) {
            price = 2.0;
        }
        else if (age<=5){
            price = 9;
        }
        else if (age<=18){
            price = 11;
        }
        else if (age>18){
            price = 12;
        }
        else{
            System.out.println("Invaild age");
            in.close();
            return;
        }

        System.out.println("Are you a first responder?");
        String firstResponder = in.next().toLowerCase();


        System.out.println("Are you a veteran");
        String veteran = in.next().toLowerCase();

        float discount = 0f; 
        if (veteran.equals("yes")){
            if (age > 18){
                discount = 0.5f;
            }
            else{
                discount = 1f;
            }
        }
        else if (firstResponder.equals("yes")){
            if (age > 18){
                discount = 0.5f;
            }
            else{
                discount = 1f;
            }
        }
        else{
            discount = 1f;
        }

        price = price*discount;

        printTicket(name, id, price);

        in.close();
    }
}