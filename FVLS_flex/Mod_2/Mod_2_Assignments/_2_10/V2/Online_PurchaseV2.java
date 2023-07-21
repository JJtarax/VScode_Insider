/**
 * The purpose of the program to make a repeict
 * 
 * @ Author: Tejas Upadhyay
 * @ Made 7/11/2023
*/
package FVLS_flex.Mod_2.Mod_2_Assignments._2_10.V2;

import java.util.Scanner;

public class Online_PurchaseV2 {
    public static void main(String[] args) {
        System.out.println();
        
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Good Evening\n");

        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();
        char firstNameInitial = name.charAt(0);
        String lastName = name.substring(name.indexOf(" "), name.length());


        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.nextLine();
        String dayYearDate = date.substring(date.indexOf("/")+1, date.length());
        String newDate = date.substring(0, date.indexOf("/"))
        + "-" + dayYearDate.substring(0,dayYearDate.indexOf("/"))
        + "-" + dayYearDate.substring(dayYearDate.indexOf("/")+1, dayYearDate.length())
        ;

        System.out.print("What movie would you like to see? ");
        String movie = in.nextLine();

        System.out.print("How many tickets? ");
        int tickets = in.nextInt();

        System.out.print("What is the price of each ticket? ");
        Double perTicketPrice = in.nextDouble();
        in.nextLine();

        System.out.print("Enter Your debit card number (####-####-####-####): ");
        String debitCard = in.nextLine();
        String formattedDebitNum = debitCard.substring(0, 4)
        + "-" + debitCard.substring(4,8)
        + "-" + debitCard.substring(8,12)
        + "-" + debitCard.substring(12)
        ;

        System.out.print("Enter your pin (####): ");
        String pin = in.nextLine();

        System.out.println("""
                *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
                ~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*
                """);


        System.out.println("Your e-Receipt:\n");

        System.out.println(newDate);
        System.out.println("Order number: ra007\n");

        System.out.println("\t" + firstNameInitial + ". " +lastName);
        System.out.println("\tAccount: " + formattedDebitNum);
        System.out.println("\tMovies: " + movie);
        System.out.println("\tNumber of tickets: " + tickets);
        System.out.println("\tPrice of each Ticket: " + perTicketPrice + "\n");

        double totalTicketPrice = perTicketPrice * (double)tickets;
        System.out.println("\t$" + totalTicketPrice + " will be debited to your account\n");
        
        System.out.println("""
                Thank you. Enjoy your movie tonight
                *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
                ~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*
                """);
        System.out.println();
        in.close();
    }
}